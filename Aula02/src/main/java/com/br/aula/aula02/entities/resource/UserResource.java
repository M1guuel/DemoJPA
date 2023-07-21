package com.br.aula.aula02.entities.resource;

import com.br.aula.aula02.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User>findALL(){
        User u = new User("maria","exempl@gmial.com","12345");
        return ResponseEntity.ok().body(u);
    }
}
