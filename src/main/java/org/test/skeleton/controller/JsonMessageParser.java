/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.test.skeleton.controller;

import java.io.InputStream;
import java.net.URI;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.test.skeleton.entity.Message;
import org.test.skeleton.entity.User;
import org.test.skeleton.repository.UserDao;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class JsonMessageParser {
    private final AntPathMatcher pathMatcher = new AntPathMatcher();
    private final ObjectMapper json = new ObjectMapper();

    private final UserDao userDao;

    @Autowired
    public JsonMessageParser(UserDao userRepository) {
        this.userDao = userRepository;
    }

    @SuppressWarnings("unchecked")
    public Message parse(InputStream in) throws Exception {
        Map<String,String> data = json.readValue(in, Map.class);
        User to = getUserFromUri(data.get("to"));
        User from = getUserFromUri(data.get("from"));

        Message message = new Message();
        message.setFrom(from);
        message.setTo(to);
        message.setSummary(data.get("summary"));
        message.setText(data.get("text"));

        return message;
    }

    private User getUserFromUri(String userUri) throws Exception {
        URI uri = new URI(userUri);
        Map<String, String> extractUriTemplateVariables = pathMatcher.extractUriTemplateVariables("/users/{id}", uri.getPath());
        String idString = extractUriTemplateVariables.get("id");
        Long id = Long.parseLong(idString);
        return userDao.findOne(id);
    }
}
