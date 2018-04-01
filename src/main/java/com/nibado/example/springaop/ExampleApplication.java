package com.nibado.example.springaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApplication {
    //https://niels.nu/blog/2017/spring-boot-aop.html
	
	
	//curl -H "user-id: 00000000-0000-0000-0000-000000000000" http://127.0.0.1:8080/todo/me
	
	public static void main(String[] args) {
       
		System.setProperty("spring.devtools.restart.enabled", "true");
		SpringApplication.run(ExampleApplication.class, args);
    }
}
