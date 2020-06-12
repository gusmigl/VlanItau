
package br.com.gama.aula.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.gama.aula.model.Solicitacao;

public interface SolicitacaoDAO extends CrudRepository<Solicitacao, Integer>{
	
	public List<Solicitacao> findByColaborador_id(int colaborador_id);

}
