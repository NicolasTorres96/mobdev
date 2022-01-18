package com.example.demo.controllers;

import com.example.demo.models.Origin;
import com.example.demo.models.Root;
import com.example.demo.models.Character;
import com.example.demo.services.CharacterService;
import com.example.demo.services.OriginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RickAndMortyController {

    @Autowired
    CharacterService characterService;

    @Autowired
    OriginService originService;

    //endpoint para generar el schema root basado en los schemas character y origin
    @GetMapping("/mobdev/{id}")
    public Root Api(@PathVariable int id) {

        Character personaje = characterService.getSimpleCharacter(id);
        Origin origen = originService.getSimpleOrigin(personaje.getId());

        Root raiz = new Root(personaje.getId(), personaje.getName(), personaje.getStatus(), personaje.getSpecies(), personaje.getType(),
                personaje.getEpisode().size(), origen);

        return raiz;
    }
}
