package com.znlccy.house;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class HouseApplication {

    @GetMapping(value = "/")
    public String index() {
        return "/index/user/login";
    }

    public static void main(String[] args) {
        SpringApplication.run(HouseApplication.class, args);
    }
}
