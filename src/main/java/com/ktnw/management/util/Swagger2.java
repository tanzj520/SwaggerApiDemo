package com.ktnw.management.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger2 {
 
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_12)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.ktnw.management.controllers"))
				.paths(PathSelectors.any())
				.build();
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Swagger api 文档 demo")
				.description("测试环境访问： http://www.tanzj_test.com/ 生产环境访问： http://www.tanzj_prod.com/")
				.termsOfServiceUrl("http://www.tanzj.com/")
				.version("1.0")
				.build();
	}
}