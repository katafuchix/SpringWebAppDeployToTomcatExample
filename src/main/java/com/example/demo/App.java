package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App extends SpringBootServletInitializer { // SpringBootServletInitializerクラスを継承

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    // configureメソッドをoverride
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(App.class);
    }

    @RequestMapping(value = "sample", method = RequestMethod.GET) // /sample でアクセス
    public String getSomething() {
        return "do something";
    }
}