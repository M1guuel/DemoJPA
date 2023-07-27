package com.br.aula.aula02.entities.resource;

import com.br.aula.aula02.entities.Order;
import com.br.aula.aula02.entities.Order;
import com.br.aula.aula02.services.OrderService;
import com.br.aula.aula02.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Orders")
public class OrderResource {

    @Autowired
    private OrderService serv;

    @GetMapping
    public ResponseEntity<List<Order>> findALL() {
        List<Order> list = serv.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value="/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
       Order obj = serv.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
