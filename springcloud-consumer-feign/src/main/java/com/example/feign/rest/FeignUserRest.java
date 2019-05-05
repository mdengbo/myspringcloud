package com.example.feign.rest;

import com.example.feign.api.UserApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    UserApi userApi;
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public  String  testFeign(@RequestParam(value = "name") String  name){
        log.info("FeignUserRest- > testFeign -> name: {}", name);
        return userApi.proTest1(name);
    }
}
