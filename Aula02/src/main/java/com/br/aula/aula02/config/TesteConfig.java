package com.br.aula.aula02.config;

import com.br.aula.aula02.entities.User;
import com.br.aula.aula02.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

    @Autowired
    private UserRepositories userRepositories;

    @Override
    public void run(String... args) throws Exception {
          User u1=  new User("Maria","Maria@gmail.com", "1234456");
          User u2 = new User ("Pedro","Exemple2@gmail.com","123456");


         userRepositories.saveAll(Arrays.asList(u1,u2));
    }
}
