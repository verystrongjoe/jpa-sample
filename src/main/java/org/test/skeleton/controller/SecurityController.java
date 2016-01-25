package org.test.skeleton.controller;

import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.hateoas.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.skeleton.core.security.CurrentUser;
import org.test.skeleton.entity.User;

@RestController
public class SecurityController {

    @RequestMapping(value="/authenticate", produces={MediaType.APPLICATION_JSON_VALUE, "application/hal+json"})
    public ResponseEntity<Resource<?>> login(PersistentEntityResourceAssembler assembler,@CurrentUser User currentUser) {
//    	currentUser.setId(1L);
        return new ResponseEntity<Resource<?>>(assembler.toResource(new User(currentUser)), HttpStatus.OK);
    }

    @RequestMapping("/csrf")
    public CsrfToken csrf(CsrfToken token) {
        return token;
    }
}
