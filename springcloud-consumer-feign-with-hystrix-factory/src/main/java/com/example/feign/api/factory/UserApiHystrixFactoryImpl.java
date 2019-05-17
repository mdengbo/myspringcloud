package com.example.feign.api.factory;

import com.example.feign.api.UserApi;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author madengbo
 * @create 2019-05-17 15:39
 * @desc
 * @Version 1.0
 **/
@Component
@Slf4j
public class UserApiHystrixFactoryImpl implements FallbackFactory<UserApi>{
    @Override
    public UserApi create(Throwable throwable) {
        //需要设置一个 UserApi 实现的接口
        log.info("FallBackFactory0001:{}",throwable.getMessage());
        return new UserApiFactory() {
            @Override
            public String proTest1(String name) {

                return "this is from my FallBackFactory 0001";
            }
        };
    }
}
