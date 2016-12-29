package com.restful.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ComponentScan("com.restful.rs.controller")
public class SpringBootRestfulwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestfulwsApplication.class, args);
	}
}
