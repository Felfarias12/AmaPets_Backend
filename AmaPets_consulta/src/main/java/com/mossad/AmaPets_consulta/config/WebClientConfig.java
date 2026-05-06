package com.mossad.AmaPets_consulta.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    
    //veterinario
    @Bean
    public WebClient veterinarioWebClient(){
        return WebClient.builder()
        .baseUrl("http://localhost:7584/").build();
    }

    //tecnico medico
    @Bean
    public WebClient tecMedicoWebClient(){
        return WebClient.builder()
        .baseUrl("http://localhost:7581/").build();
    }

    //mascota
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

    //ficha clinica
    @Bean
    public WebClient fichaClinicaClient(){
        return WebClient.builder()
        .baseUrl("http://localhost:7584/").build();
    }

}
