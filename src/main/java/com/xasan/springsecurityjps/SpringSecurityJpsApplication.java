package com.xasan.springsecurityjps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityJpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJpsApplication.class, args);
	}

}
