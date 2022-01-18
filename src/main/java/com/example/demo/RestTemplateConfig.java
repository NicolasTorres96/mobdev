package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    //configuracion basica de RestTemplate para llamar a RickAndMortyApi
    @Bean
    public RestTemplate ClienteRest(){
        return new RestTemplate();
    }
}
