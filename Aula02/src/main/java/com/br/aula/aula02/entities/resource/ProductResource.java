package com.br.aula.aula02.entities.resource;

import com.br.aula.aula02.entities.Product;
import com.br.aula.aula02.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService serv;

    @GetMapping
    public ResponseEntity<List<Product>> findALL() {
        List<Product> list = serv.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value="/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product obj = serv.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
