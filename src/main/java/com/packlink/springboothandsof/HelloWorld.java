package com.packlink.springboothandsof;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.activation.DataSource;
import javax.persistence.EntityManagerFactory;

@SpringBootApplication
@EnableJpaRepositories
public class HelloWorld {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWorld.class, args);
    }

}
