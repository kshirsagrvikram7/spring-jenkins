package com.vksagar.jenkins.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	private static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("++++ In init() ++++");
	}

	public static void main(String[] args) {
		logger.info("++++ In main() ++++");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
