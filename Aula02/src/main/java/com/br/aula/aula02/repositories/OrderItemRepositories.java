package com.br.aula.aula02.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.aula.aula02.entities.OrderItem;

public interface OrderItemRepositories extends JpaRepository<OrderItem,Long> {

}
