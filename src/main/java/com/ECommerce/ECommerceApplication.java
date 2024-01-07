package com.ECommerce;

import io.swagger.annotations.License;
import lombok.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.service.SecurityScheme;


@SpringBootApplication
public class ECommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}


//	@Bean
//	public OpenAPI customOpenAPI(@Value("${springdoc.version}") String appVersion) {
//		return new OpenAPI()
//				.components(new Components().addSecuritySchemes("basicScheme",
//						new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("basic")))
//				.info(new ProcessHandle.Info().title("E-Commerce Application REST API").version(appVersion)
//						.license(new License().name("Apache 2.0").url("http://springdoc.org")));
//	}
}
