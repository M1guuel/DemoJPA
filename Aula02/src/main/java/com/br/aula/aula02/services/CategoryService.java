package com.br.aula.aula02.services;

import com.br.aula.aula02.entities.Category;
import com.br.aula.aula02.entities.Order;
import com.br.aula.aula02.repositories.CategoryRepositories;
import com.br.aula.aula02.repositories.OrderRepositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepositories repository;

    public List<Category> findAll() {
        return repository.findAll();
    }
    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
                return obj.get();
    }

}
