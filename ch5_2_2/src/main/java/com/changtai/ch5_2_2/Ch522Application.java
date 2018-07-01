package com.changtai.ch5_2_2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Ch522Application {

    @Value("${book.author}")
    private String bookAuthor;

    @Value("${book.name}")
    private String bookName;

    @RequestMapping("/")
    String index(){
        return "Hello Spring Boot:" + bookAuthor + ":" + bookName;
    }


    public static void main(String[] args) {
        SpringApplication.run(Ch522Application.class, args);

        //SpringApplication app = new SpringApplication(Ch522Application.class);
        //app.setShowBanner(false);
        //app.run(args);

        //new SpringApplicationBuilder(Ch522Application.class).showBanner(false).run(args);
    }
}
