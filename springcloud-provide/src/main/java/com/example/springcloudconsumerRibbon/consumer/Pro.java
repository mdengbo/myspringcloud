package com.example.springcloudconsumerRibbon.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("/get")
    public String proTest1(@RequestParam String name){
        log.info("pro: {}", name);
        return "welcome " + name;
    }
}
