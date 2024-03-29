package com.example.AjaxExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication(scanBasePackages = "com.example")
public class AjaxExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AjaxExampleApplication.class, args);
	}

}
