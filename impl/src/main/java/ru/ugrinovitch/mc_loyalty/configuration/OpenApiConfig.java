package ru.ugrinovitch.mc_loyalty.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

// http://localhost:8081/swagger-ui/index.html
@OpenAPIDefinition(
        info = @Info(
                title = "LoyaltyApi",
                description = "Bonus system", version = "1.0.0",
                contact = @Contact(
                        name = "Ugrinovich Maxim",
                        email = "xxmzims@gmail.com"
                )
        )
)
public class OpenApiConfig {
}
