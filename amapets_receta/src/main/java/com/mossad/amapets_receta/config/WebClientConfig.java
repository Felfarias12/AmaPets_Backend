package com.mossad.amapets_receta.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    
    //usuario
    @Bean
    public WebClient usuarioWebClient(){
        return WebClient.builder()
        .baseUrl("http://localhost:7580/").build();
    }

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


}
