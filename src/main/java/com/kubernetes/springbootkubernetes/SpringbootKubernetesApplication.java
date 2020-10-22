package com.kubernetes.springbootkubernetes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.kubernetes.controller"})
public class SpringbootKubernetesApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringbootKubernetesApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringbootKubernetesApplication.class, args);
		LOGGER.info("Spring Boot application start");
	}

}
