package com.zjr.swagger_ui_controller.swaggerConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-28T09:26:05.566Z")
@Configuration
public class SwaggerDocumentationConfig {

	ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("xxx接口定义").description("").license("").licenseUrl("")
				.termsOfServiceUrl("").version("1.0.0").contact(new Contact("", "", "")).build();
	}

	@Bean
	public Docket customImplementation() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.zjr.swagger_ui_controller"))
				.apis(RequestHandlerSelectors.basePackage("com.zjr.swagger_ui_controller.controller")).build()
				.apiInfo(apiInfo());
	}

}
