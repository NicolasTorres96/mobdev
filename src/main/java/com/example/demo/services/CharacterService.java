package com.example.demo.services;

import com.example.demo.models.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CharacterService {
    @Autowired
    private RestTemplate cliente;

    public Character getSimpleCharacter(int id){
       return cliente.getForObject("https://rickandmortyapi.com/api/character/" + id, Character.class);
    }
}
