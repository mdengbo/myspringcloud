package com.example.feign.api.hystrix;

import com.example.feign.api.UserApi;
import org.springframework.stereotype.Component;

/**
 * @author madengbo
 * @create 2019-05-15 17:24
 * @desc
 * @Version 1.0
 **/
@Component
public class UserApiHystrixImpl implements UserApi{
    @Override
    public String proTest1(String name) {
        return "welcome " + name + " 进入hystrix!!!";
    }
}
