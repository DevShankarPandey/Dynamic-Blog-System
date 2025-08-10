package com.dev.blogServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(BlogServerApplication.class, args);
        System.out.println("Hello World");
	}
}
