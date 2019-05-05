package com.example.feign.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author madengbo
 * @create 2019-04-16 10:06
 * @desc 服务提供者注册
 * @Version 1.0
 **/
@RestController
@RequestMapping("/pro")
@Slf4j
public class Pro {
    @GetMapping("/get/{name}")
    public String proTest1(@PathVariable("name") String name){
        log.info("provider -> proTest1 -> pro: {}", name);
        return "welcome " + name;
    }
}
