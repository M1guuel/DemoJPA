package com.br.aula.aula02.services;

import com.br.aula.aula02.entities.Order;

import com.br.aula.aula02.repositories.OrderRepositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepositories repository;

    public List<Order> findAll() {
        return repository.findAll();
    }
    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
                return obj.get();
    }

}
