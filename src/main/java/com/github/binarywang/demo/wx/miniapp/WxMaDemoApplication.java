package com.github.binarywang.demo.wx.miniapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */
@EnableSwagger2
@SpringBootApplication
public class WxMaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxMaDemoApplication.class, args);
    }
}
