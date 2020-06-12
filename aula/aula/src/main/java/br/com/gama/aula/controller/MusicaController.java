/*
 package br.com.gama.aula.controller;
 


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.gama.aula.dao.MusicaDAO;
import br.com.gama.aula.model.Musica;

@RestController
@CrossOrigin("*")
public class MusicaController {
	
	@Autowired
	private MusicaDAO dao;
	
	@PostMapping ("/musica/nova")
	public ResponseEntity<Musica> novaMusica(@RequestBody Musica nova) {
		try {
			dao.save(nova);
			return ResponseEntity.ok(nova);
		}catch(Exception e) {
			return ResponseEntity.status(400).build();
		}
	
	}
}
	
	*/
