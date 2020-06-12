
 package br.com.gama.aula.controller;
 


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.gama.aula.dao.DepartamentoDAO;
import br.com.gama.aula.model.Departamento;
import br.com.gama.aula.model.Solicitacao;

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
	
	@GetMapping("/departamentos")
	public ResponseEntity<List<Departamento>> getDepartamentos
															(){
		ArrayList<Departamento> lista = (ArrayList<Departamento>)dao.findAll();
		if (lista.size()!=0) {
			return ResponseEntity.ok(lista);
		}else {
			return ResponseEntity.status(403).build();
		}
	}
	
	
}
	
	
