package com.example.springcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableCaching
@EnableEurekaServer
public class EurekaServiceCacheApplication {
	public static void main(String[] args) {		
		SpringApplication.run(EurekaServiceCacheApplication.class, args);
		
	}
}
