
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

import br.com.gama.aula.dao.SolicitacaoDAO;
import br.com.gama.aula.model.Solicitacao;

@RestController
@CrossOrigin("*")
public class SolicitacaoController {
	
	@Autowired
	private SolicitacaoDAO dao;
	
	@PostMapping ("/solicitacao/nova")
	public ResponseEntity<Solicitacao> novaSolicitacao(@RequestBody Solicitacao nova) {
		try {
			

			nova.setComando("TESTE DO COMANDO");
			
			
			
			dao.save(nova);
			return ResponseEntity.ok(nova);
		}catch(Exception e) {
			return ResponseEntity.status(400).build();
		}
	
	}
	
	@GetMapping("/solicitacoes/{colaborador_id}")
	public ResponseEntity<List<Solicitacao>> getSolicitacoesByColaborador_Id
															(@PathVariable int colaborador_id){
		ArrayList<Solicitacao> lista = (ArrayList<Solicitacao>)dao.findByColaborador_id(colaborador_id);
		if (lista.size()!=0) {
			return ResponseEntity.ok(lista);
		}else {
			return ResponseEntity.status(403).build();
		}
	}
	
	
}
	
	
