package com.skh.sroom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SroomApplication {

	public static void main(String[] args) {
		SpringApplication.run(SroomApplication.class, args);
	}

}
