package com.eridanus.post;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableEurekaClient
public class PostApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostApplication.class, args);
	}

}
