
 package br.com.gama.aula.controller;
 


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.gama.aula.dao.DepartamentoDAO;
import br.com.gama.aula.model.Departamento;

@RestController
@CrossOrigin("*")
public class DepartamentoController {
	
	@Autowired
	private DepartamentoDAO dao;
	
	@PostMapping ("/departamento/novo")
	public ResponseEntity<Departamento> novoDepartamento(@RequestBody Departamento novo) {
		try {
			dao.save(novo);
			return ResponseEntity.ok(novo);
		}catch(Exception e) {
			return ResponseEntity.status(400).build();
		}
	
	}
}
	
	
