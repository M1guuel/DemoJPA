package com.br.aula.aula02.entities.resource;

import com.br.aula.aula02.entities.User;
import com.br.aula.aula02.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService serv;

    @GetMapping
    public ResponseEntity<List<User>> findALL() {
        List<User> list = serv.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value="/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = serv.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
