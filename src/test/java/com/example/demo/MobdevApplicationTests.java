package com.example.demo;

import com.example.demo.models.Character;
import com.example.demo.models.Origin;
import com.example.demo.services.CharacterService;
import com.example.demo.services.OriginService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MobdevApplicationTests {

	@Autowired
	CharacterService characterService;

	@Autowired
	OriginService originService;

	// prueba de validacion del servicio de traer 1 personaje
	@Test
	public void CharacterTest() {
		int id = 1;

		Character personaje = characterService.getSimpleCharacter(id);

		Assertions.assertNotNull(personaje);
	}

	// prueba de validacion del servicio de traer 1 origen
	@Test
	public void OriginTest() {
		int id = 1;

		Origin origen = originService.getSimpleOrigin(id);
		Assertions.assertNotNull(origen);
	}

}
