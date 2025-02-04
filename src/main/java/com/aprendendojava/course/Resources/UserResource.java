package com.aprendendojava.course.Resources;

import entities.User;
import org.apache.coyote.Response;
import org.apache.tomcat.util.buf.UEncoder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){

        User u = new User(1L, "Maria", "Maria@gmail.com", "93209234", "1234");
        return ResponseEntity.ok().body(u);
    }
}
