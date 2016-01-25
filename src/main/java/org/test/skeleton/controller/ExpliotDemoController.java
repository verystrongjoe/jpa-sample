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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.test.skeleton.entity.Message;
import org.test.skeleton.repository.MessageDao;

@Controller
public class ExpliotDemoController {
	
    private final MessageDao messageDao;
    private final JsonMessageParser messageParser;

    @Autowired
    public ExpliotDemoController(MessageDao messageDao,JsonMessageParser messageParser) {
        super();
        this.messageDao = messageDao;
        this.messageParser = messageParser;
    }

    @RequestMapping(value="/csrf/messages/", method=RequestMethod.POST)
    public void exploit(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Message messageToSave = messageParser.parse(request.getInputStream());

        messageDao.save(messageToSave);

        response.sendRedirect(request.getContextPath());
    }
}
