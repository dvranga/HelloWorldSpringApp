package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		System.out.println("Hello world");
		SpringApplication.run(HelloworldApplication.class, args);
	}

}