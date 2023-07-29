package com.br.aula.aula02.entities.resource;

import com.br.aula.aula02.entities.Category;
import com.br.aula.aula02.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/ordemItem")
public class OrdemItemResource {

    @Autowired
    private CategoryService serv;

    @GetMapping
    public ResponseEntity<List<Category>> findALL() {
        List<Category> list = serv.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value="/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
       Category obj = serv.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
