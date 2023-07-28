package com.br.aula.aula02.repositories;

import com.br.aula.aula02.entities.Category;
import com.br.aula.aula02.entities.Order;
import com.br.aula.aula02.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositories extends JpaRepository<Category,Long> {

}
