package com.ramjava.post.dienst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableEurekaClient not needed in Spring Boot 2.4+ and higher
public class PostDienstApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostDienstApplication.class, args);
	}

}
