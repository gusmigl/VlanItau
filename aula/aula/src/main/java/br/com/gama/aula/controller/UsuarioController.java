/*
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

import br.com.gama.aula.dao.UsuarioDAO;
import br.com.gama.aula.model.Usuario;

// Indica para o JAVA que estah classe ira manipukar metodos http
@RestController
@CrossOrigin("*")
public class UsuarioController {
	
	@Autowired  //Deixo a instancia por conta do JPA HIBERNATE
	private UsuarioDAO dao;
	
	@GetMapping("/usuarios")
	public ResponseEntity<List<Usuario>> getAll(){
		ArrayList<Usuario> lista = (ArrayList<Usuario>) dao.findAll();
		if(lista.size()>0) {
		return ResponseEntity.ok(lista);
		}else {
			return ResponseEntity.notFound().build(); // no lugar do "notfound" pode utilizar "status(403)"
		}
/* public List<Usuario> getAll(){
		ArrayList<Usuario> lista = (ArrayList<Usuario>) dao.findAll();
		return lista;*/
/*	}
	
	@GetMapping("/usuarios/{id}")
	//PathVariable => indica que o parametro virah da URL
	public ResponseEntity<Usuario> getUserId(@PathVariable int id){
		Usuario resposta = dao.findById(id).orElse(null);
		if (resposta != null) {
			return ResponseEntity.ok(resposta);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	@PostMapping("/login")
	public ResponseEntity<Usuario> logar(@RequestBody Usuario usuario) {
		Usuario objeto = dao.findByEmailAndSenha(usuario.getEmail(), usuario.getSenha());
		if (objeto!=null) {
			return ResponseEntity.ok(objeto);
		}else {
			return ResponseEntity.status(403).build();
		}
	}
	
}
*/
