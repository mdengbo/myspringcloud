package com.example.springcloudconsumerRibbon.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author madengbo
 * @create 2019-04-16 16:20
 * @desc
 * @Version 1.0
 **/
@RestController
@RequestMapping("/ribbon")
@Slf4j
public class RibbonCon {
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/test")
    public String test() {
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("springcloud-provider");
        String info =  serviceInstance.getServiceId() + ":" + serviceInstance.getHost() + ":" + serviceInstance.getPort();
        log.info("first: {} : {} : {}" , serviceInstance.getServiceId() ,serviceInstance.getHost() , serviceInstance.getPort());
        return  info;
    }
}
