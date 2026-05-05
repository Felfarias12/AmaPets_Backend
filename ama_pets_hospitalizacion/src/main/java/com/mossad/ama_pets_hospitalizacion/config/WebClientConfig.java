package com.mossad.ama_pets_hospitalizacion.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    //tecnico medico
    @Bean
    public WebClient tecMedicoWebClient(){
        return WebClient.builder()
        .baseUrl("http://localhost:7581/").build();
    }

    //veterinario
    @Bean
    public WebClient veterinarioWebClient(){
        return WebClient.builder()
        .baseUrl("http://localhost:7584/").build();
    }

    
}

