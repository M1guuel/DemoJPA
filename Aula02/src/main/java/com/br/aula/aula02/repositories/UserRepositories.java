package com.br.aula.aula02.repositories;

import com.br.aula.aula02.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositories extends JpaRepository<User,Long> {

}
