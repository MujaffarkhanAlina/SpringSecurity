package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

	public static void main(String[] args) {
		
		
		System.out.println("branch tag to mater Five chnage......");
		System.out.println("branch tag to mater branch......");
		System.out.println("branch tag to mater branch......");
		System.out.println("Change in tag branch......");
		System.out.println("Change in tag branch......");
		System.out.println("Hello......");
		System.out.println("second changes--Hello......");
		SpringApplication.run(EurekaApplication.class, args);
		System.out.println("second changes--Hello......");
		System.out.println("second changes--Hello......");
		System.out.println("second changes--Hello......");
		System.out.println("Hello......");
	}
}
