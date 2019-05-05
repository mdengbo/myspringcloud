package com.example.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //@EnableEurekaClient 可替代
public class SpringcloudProvideApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudProvideApplication.class, args);
	}

}
