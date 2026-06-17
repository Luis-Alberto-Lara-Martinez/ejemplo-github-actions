package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	static void main() {
		SpringApplication.run(DemoApplication.class);
		IO.println("Hola mundo en Spring Boot");
	}
}
