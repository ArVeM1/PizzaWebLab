package com.example.pizzaweblab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class PizzaWebLabApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PizzaWebLabApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
