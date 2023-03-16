package com.xasan.springsecurityjps;

import models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.xasan.springsecurityjps")
@ComponentScan(basePackages = { "com.xasan.springsecurityjps", "models"})
@EntityScan("models")
public class SpringSecurityJpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJpsApplication.class, args);
	}

}
