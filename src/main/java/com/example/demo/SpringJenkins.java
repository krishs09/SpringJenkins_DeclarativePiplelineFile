package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages= {"com.example.conroller","com.example.demo"})
//public class SpringJenkins extends SpringBootServletInitializer {
public class SpringJenkins  {
	public static Logger logger = LoggerFactory.getLogger(SpringJenkins.class);
	
	
	  @PostConstruct public void init() 
	  { 
		  logger.info("Application started.."); 
	}
	 
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJenkins.class, args);
	}
	
	
	
	

}
