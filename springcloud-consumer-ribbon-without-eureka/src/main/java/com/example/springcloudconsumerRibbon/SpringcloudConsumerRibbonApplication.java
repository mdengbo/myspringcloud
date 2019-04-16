package com.example.springcloudconsumerRibbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableDiscoveryClient //@EnableEurekaClient 可替代
public class SpringcloudConsumerRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConsumerRibbonApplication.class, args);
	}

}
