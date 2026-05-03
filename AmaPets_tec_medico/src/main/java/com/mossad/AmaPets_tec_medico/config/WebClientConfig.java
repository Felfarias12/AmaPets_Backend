package com.mossad.AmaPets_tec_medico.config;

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

    //usuario
    @Bean
    public WebClient usuarioWebClient(){
        return WebClient.builder()
        .baseUrl("http://localhost:7580/").build();
    }
    
    //hospitalizacion
    @Bean
    public WebClient hospitalizacionWebClient(){
        return WebClient.builder()
        .baseUrl("http://localhost:7583/").build();
    }

    //veterinario
    @Bean
    public WebClient veterinarioWebClient(){
        return WebClient.builder()
        .baseUrl("http://localhost:7584/").build();
    }


}

