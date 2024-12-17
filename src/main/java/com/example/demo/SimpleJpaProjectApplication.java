package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.*")
@ComponentScan(basePackages = {"com.example.*"})
@EntityScan(basePackages = "com.example.*")
public class SimpleJpaProjectApplication{

	public static void main(String[] args) {
		SpringApplication.run(SimpleJpaProjectApplication.class, args);
	}

}
