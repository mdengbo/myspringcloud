/*
package com.example.springcloudconsumerRibbon;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

*/
/**
 * @author madengbo
 * @create 2019-04-16 15:49
 * @desc 自定义 负载均衡的算法 此方法 避免被主类加载扫描到 1:放置于 主类的 上一级目录   2：在spring加载时 避免扫描到
 * @Version 1.0
 **//*

@Configuration
@ExcludeFromComponentScan
public class MyConf {

    @Bean
    public IRule ribbonConf(){
        return new RandomRule();
    }
}
*/
