package com.mossad.AmaPets_Ficha_Clinica.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.beans.factory.annotation.Value;

@Configuration
public class OpenApiConfiguration {
    
    @Value("${app.version}")
    private String versionApp;


    @Bean
    public OpenAPI documentacionApi() {
        return new OpenAPI()
        .info(new Info()
        .title("Documentación API de Ficha Clínica")
        .description("agregar, eliminar, actualizar y obtener fichas clínicas")
        .version("1.0.1")
        );
    }

}
