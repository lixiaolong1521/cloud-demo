package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
@SpringBootApplication
继承自
@EnableAutoConfiguration
@ComponentScan*/

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//建立spring容器，返回ApplicationContext对象
		SpringApplication.run(DemoApplication.class, args);
	}

}
