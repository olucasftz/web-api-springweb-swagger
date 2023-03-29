package com.firstwebapi.doc;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
        info = @Info(
                title = "Hello to my first API",
                version = "1.0.0",
                description = "this project is only for learning",
                termsOfService = "Open Source",
                contact = @Contact(
                        name = "Lucas",
                        email = "none"
                ),
                license = @License(
                        name = "license",
                        url = "localhost:8080/hello"
                )
        )
)
public class SwaggerConfig{
}
