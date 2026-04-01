package com.example.AdlerUniversal39;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdlerUniversal39Application {

	public static void main(String[] args) {
		SpringApplication.run(AdlerUniversal39Application.class, args);
		System.out.println("Hello and welcome to Overlook hotel");
        SpringApplication.run(TypeController.class, args);
	}
}