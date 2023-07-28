package com.br.aula.aula02.config;

import com.br.aula.aula02.entities.Order;
import com.br.aula.aula02.entities.User;
import com.br.aula.aula02.entities.enums.Enums;
import com.br.aula.aula02.repositories.OrderRepositories;
import com.br.aula.aula02.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

    @Autowired
    private UserRepositories userRepositories;
    @Autowired
    private OrderRepositories orderRepositories;

    @Override
    public void run(String... args) throws Exception {
          User u1=  new User("Maria","Maria@gmail.com", "1234456");
          User u2 = new User ("Pedro","Exemple2@gmail.com","123456");

          Order o1 = new Order(null,Enums.PAID, Instant.parse("2019-06-20T19:53:07Z"), u1);
          Order o2 = new Order(null,Enums.WAITIN_PAYMENT, Instant.parse("2019-07-21T03:42:10Z"), u2);
          Order o3 = new Order(null,Enums.WAITIN_PAYMENT, Instant.parse("2019-07-22T15:21:22Z"), u1);
          
         userRepositories.saveAll(Arrays.asList(u1,u2));
         orderRepositories.saveAll(Arrays.asList(o1,o2,o3));
    }
}
