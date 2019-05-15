package com.example.feign.api;

import com.example.feign.api.hystrix.UserApiHystrixImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author madengbo
 * @create 2019-05-05 11:37
 * @desc  springcloud-provider 为所调用的服务的 service-id
 * path, url :你要请求的服务的地址 最终请求到的地址会拼接为  127.0.0.1:8762/pro/get/xxxxxx  当有url 时  name 是必须存在的
 *
 * @Version 1.0
 **/
@FeignClient(name = "springcloud-provider", path = "/pro",fallback = UserApiHystrixImpl.class)
public interface UserApi {

    /**
     * 对应服务里面的  rest 方法
     * 两个坑：1. @GetMapping不支持   2. @PathVariable得设置value
     * @RequestMapping value 可为所请求的服务的 全路径  也可以通过 FeignCilent 中的 path 设置全局的前缀
     * */
    @RequestMapping(value = "/get/{name}", method = RequestMethod.GET)
    public String proTest1(@PathVariable("name") String name);
}
