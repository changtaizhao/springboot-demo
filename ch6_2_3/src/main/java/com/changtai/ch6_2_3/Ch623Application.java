package com.changtai.ch6_2_3;

import com.changtai.ch6_2_3.config.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Ch623Application {

    @Autowired
    private AuthorSettings authorSettings;

    @RequestMapping("/")
    public String index(){
        return authorSettings.getName() + ":" + authorSettings.getAge();
    }

    public static void main(String[] args) {
        SpringApplication.run(Ch623Application.class, args);
    }
}
