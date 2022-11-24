package com.project.db.mju.webserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(SwaggerInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.project.db.mju.webserver.web.controller"))
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false);
    }

    private ApiInfo SwaggerInfo() {
        return new ApiInfoBuilder()
                .title("디비설 프로젝트 Swagger")
                .description("디비설 프로젝트 API Swagger 문서")
                .version("1.0")
                .build();
    }
}