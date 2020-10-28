package com.music.phi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.music.phi.model"})
public class MyFreeTimeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyFreeTimeApplication.class, args);
    }

}
