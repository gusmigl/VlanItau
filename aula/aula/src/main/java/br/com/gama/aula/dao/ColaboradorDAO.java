package br.com.gama.aula.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.gama.aula.model.Colaborador;
//CrudRepository contem os metodos para 
//CRUD Create Read Update Delete
//Precisamos especificar o modelo e o TIPO de dado da chave Primaria
public interface ColaboradorDAO extends  CrudRepository<Colaborador, Integer> {
//programar os metodos cadastrar, consultar, alterar e excluir
//#SQN

	public Colaborador findByEmailAndSenha(String email, String senha);
	
	public Colaborador findByRacfAndSenha(String racf, String senha);
	
	
}
