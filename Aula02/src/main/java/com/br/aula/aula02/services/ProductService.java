package com.br.aula.aula02.services;

import com.br.aula.aula02.entities.Product;
import com.br.aula.aula02.repositories.ProductRepositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepositories repository;

    public List<Product> findAll() {
        return repository.findAll();
    }
    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
                return obj.get();
    }

}
