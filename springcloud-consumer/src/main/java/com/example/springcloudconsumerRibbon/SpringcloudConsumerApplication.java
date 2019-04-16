package com.example.springcloudconsumerRibbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //@EnableEurekaClient 可替代
public class SpringcloudConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConsumerApplication.class, args);
	}

}
