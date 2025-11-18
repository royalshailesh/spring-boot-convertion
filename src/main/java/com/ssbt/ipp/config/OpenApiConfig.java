package com.ssbt.ipp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI applicationOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Converted API")
                .description("OpenAPI documentation for converted C++ to Java endpoints")
                .version("1.0.0")
                .contact(new Contact().name("Generated").email("noreply@example.com"))
                );
    }
}