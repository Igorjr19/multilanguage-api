package com.multilanguage_api.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@SpringBootApplication
@RestController
public class JavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaApplication.class, args);
	}

	@GetMapping("/")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return """
            Hello, %s! 
            Welcome to our Java 25 powered Spring Boot API.
            Current time: %s
            """.formatted(name, java.time.LocalDateTime.now());
    }
}
