package com.example.crudfeature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class CrudFeatureApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudFeatureApplication.class, args);
	}

}
