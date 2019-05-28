package com.example.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author madengbo
 * @Time 2019-05-27
 */
@SpringBootApplication
@EnableZuulProxy
public class SpringcloudZuulFallBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudZuulFallBackApplication.class, args);
	}

}
