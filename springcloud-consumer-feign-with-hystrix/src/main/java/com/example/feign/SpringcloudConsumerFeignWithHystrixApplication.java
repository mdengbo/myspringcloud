package com.example.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author Administrator
 */
@SpringBootApplication
/**
 * @EnableEurekaClient 可替代
 * */
@EnableEurekaClient
@EnableFeignClients
public class SpringcloudConsumerFeignWithHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConsumerFeignWithHystrixApplication.class, args);
	}

}
