package com.br.aula.aula02.repositories;

import com.br.aula.aula02.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositories extends JpaRepository<Product,Long> {

}
