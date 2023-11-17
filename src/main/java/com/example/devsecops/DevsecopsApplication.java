package com.example.devsecops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DevsecopsApplication {

	@GetMapping("/")
	public String hello(){
		return "<html><body><h1>Hello DevSecOps</h1></body></html>";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevsecopsApplication.class, args);
	}

}
