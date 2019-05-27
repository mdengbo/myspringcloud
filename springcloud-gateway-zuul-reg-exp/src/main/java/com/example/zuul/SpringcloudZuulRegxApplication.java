package com.example.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;

/**
 * @author madengbo
 * @Time 2019-05-27
 */
@SpringBootApplication
@EnableZuulProxy
public class SpringcloudZuulRegxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudZuulRegxApplication.class, args);
	}

	@Bean
	public PatternServiceRouteMapper serviceRouteMapper() {
		return new PatternServiceRouteMapper(
				"(?<name>^.+)-(?<version>v.+$)",
				"${version}/${name}");
	}

}
