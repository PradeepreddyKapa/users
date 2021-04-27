package com.elgris.usersapi;

import com.elgris.usersapi.security.JwtAuthenticationFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
@EnableScheduling
public class UsersApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersApiApplication.class, args);
	}
}
