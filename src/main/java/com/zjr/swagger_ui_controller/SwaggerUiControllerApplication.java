package com.zjr.swagger_ui_controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class SwaggerUiControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerUiControllerApplication.class, args);
    }
}
