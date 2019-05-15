package com.example.feign.rest;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author madengbo
 * @create 2019-05-05 11:43
 * @desc
 * @Version 1.0
 **/
@RestController
@RequestMapping("feign")
@Slf4j
public class FeignUserRest {

    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "testFeignFallback")
    public  String  testFeign(@RequestParam(value = "name") String  name){
        log.info("FeignUserRest- > testFeign -> name: {}", name);
        //springcloud-provider 表示调用的服务的 service_id 也为虚拟 ip
        return this.restTemplate.getForObject("http://springcloud-provider/pro/get/"+name,String.class);
    }
    /**
     * fallback 方法的参数和 返回值应与 调用的 参数与返回值一致
     * */
    public  String  testFeignFallback(String  name){
        log.info("FeignUserRest- > testFeign -> name: {}", name);
        return name+" 您好！很遗憾，当前访问人数过多，请稍后再试！！";
    }

}
