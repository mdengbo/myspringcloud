package com.itmuch.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/**
 * 因为 bean 实例是lazy  load 在第一初始化时  会进行缓存 当再次使用时 直接从缓存中获取
 * 但是当 @RefreshScope 注解 该注解会监控对应的 configuration 的变化
 * 假如有变  就会再次实例化 在进行缓存 避免再次由于某种需要 再次重启程序
 *  需要在后台或者通过 postman 工具 post 请求：192.168.1.39:8081/refresh 以刷新缓存
 *
 * */
@RefreshScope
public class ConfigClientController {

  @Value("${profile}")
  private String profile;

  @GetMapping("/profile")
  public String getProfile() {
    return this.profile;
  }
}
