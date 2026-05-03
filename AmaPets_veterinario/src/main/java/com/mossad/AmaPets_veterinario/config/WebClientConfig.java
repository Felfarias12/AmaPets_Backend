package com.mossad.AmaPets_veterinario.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    //Mascota
    @Bean
    public WebClient mascotaWebClient(){
        return WebClient.builder()
        .baseUrl("http://localhost:7579/").build();
    }
    
    //Receta
    @Bean
    public WebClient recetaWebClient(){
        return WebClient.builder()
        .baseUrl("http://localhost:7581/").build();
    }

    //usuario
    @Bean
    public WebClient usuarioWebClient(){
        return WebClient.builder()
        .baseUrl("http://localhost:7580/").build();
    }

    //cirugia
    @Bean
    public WebClient cirugiaClient(){
        return WebClient.builder()
        .baseUrl("http://localhost:7582/").build();
    }

    //ficha clinica
    @Bean
    public WebClient fichaClinicaClient(){
        return WebClient.builder()
        .baseUrl("http://localhost:7584/").build();
    }


}
