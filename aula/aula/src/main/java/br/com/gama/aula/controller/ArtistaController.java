/*package br.com.gama.aula.controller;

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

import br.com.gama.aula.dao.ArtistaDAO;
import br.com.gama.aula.model.Artista;

@RestController
@CrossOrigin("*")
public class ArtistaController {
	
	@Autowired
	private ArtistaDAO dao; //metodo
	
	@GetMapping("/artistas")
	private ResponseEntity<List<Artista>> getAll(){
		ArrayList<Artista> lista = (ArrayList<Artista>) dao.findAll();
		if (lista.size()!=0) {
			return ResponseEntity.ok(lista);
		}else {
			return ResponseEntity.status(403).build();
		}
	}
	
	@GetMapping("/artista/{codigo}")
	public ResponseEntity<Artista> getArtistaCodigo(@PathVariable int codigo){
		Artista resposta = dao.findById(codigo).orElse(null);
		if (resposta!=null) {
			return ResponseEntity.ok(resposta);
		}else {
			return ResponseEntity.status(403).build();
		}
	}
	@GetMapping("/nacionalidade/{nac}")
	public ResponseEntity<List<Artista>> getArtistaNacionalidade
															(@PathVariable String nacional){
		ArrayList<Artista> lista = (ArrayList<Artista>)dao.findByNacionalidade(nacional);
		if (lista.size()!=0) {
			return ResponseEntity.ok(lista);
		}else {
			return ResponseEntity.status(403).build();
		}
	}
	@PostMapping("/artista/novo")
	public ResponseEntity<Artista> novoArtista(@RequestBody Artista novo) {
		try {
			dao.save(novo);
			return ResponseEntity.ok(novo);
		}catch (Exception e) {
			return ResponseEntity.status(403).build();
		}
		
	}
}
	
	
*/