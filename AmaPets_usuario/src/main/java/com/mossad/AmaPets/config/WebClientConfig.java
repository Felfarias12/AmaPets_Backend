package com.mossad.AmaPets.config;

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
    
}
