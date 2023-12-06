package com.ll.sb231206;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Sb231206Application {

    public static void main(String[] args) {
        SpringApplication.run(Sb231206Application.class, args);
    }

}
