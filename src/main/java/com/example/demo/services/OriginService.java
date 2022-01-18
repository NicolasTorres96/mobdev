package com.example.demo.services;

import com.example.demo.models.Origin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OriginService {
    @Autowired
    private RestTemplate cliente;

    public Origin getSimpleOrigin(int id){
        return cliente.getForObject("https://rickandmortyapi.com/api/location/" + id, Origin.class);
    }
}
