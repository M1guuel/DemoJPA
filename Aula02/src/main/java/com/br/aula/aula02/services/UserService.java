package com.br.aula.aula02.services;

import com.br.aula.aula02.entities.User;
import com.br.aula.aula02.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepositories repository;

    public List<User> findAll() {
        return repository.findAll();
    }
    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
                return obj.get();
    }
}
