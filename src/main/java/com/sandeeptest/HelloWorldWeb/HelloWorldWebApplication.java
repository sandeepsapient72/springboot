package com.sandeeptest.HelloWorldWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.test.controllers")
public class HelloWorldWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldWebApplication.class, args);
	}
}
