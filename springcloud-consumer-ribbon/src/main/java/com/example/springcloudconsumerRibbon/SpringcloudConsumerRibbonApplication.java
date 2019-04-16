package com.example.springcloudconsumerRibbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@EnableDiscoveryClient //@EnableEurekaClient 可替代
/**
 * name: springcloud-provider  指定需要实现负载均衡的对象，  此处指注册到 eureka 的虚拟 ip 即为spring.application.name
 * @RibbonClient (name = " springcloud-provider", configuration = MyConf.class)  configuration:自定义的轮询类
 * */
@RibbonClient(name = " springcloud-provider")
/*@ComponentScan(
		excludeFilters = {
				@ComponentScan.Filter(type = FilterType.ANNOTATION, value = ExcludeFromComponentScan.class)
		})*/   //避免自定义的confi 被加载扫描
public class SpringcloudConsumerRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConsumerRibbonApplication.class, args);
	}

}
