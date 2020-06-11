/*
package br.com.gama.aula.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity 
@Table(name="TB_AULA_ARTISTA")

public class Artista {
	@Column(name="CODIGO")
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)   
	private int codigo;
	
	@Column(name="NOMEARTISTICO", length=30)
	private String nomeArtistico;
	
	@Column(name="NACIONALIDADE", length=30)
	private String nacionalidade;
	
	@JsonIgnoreProperties("artista")
	@OneToMany(cascade=CascadeType.ALL , mappedBy="artista")
	private List<Musica> musicas;
	
	@Column(name="CADASTRO")
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	public Date cadastro;

	public Artista() {
		super();
	}

	public Artista(int codigo, String nomeArtistico, String nacionalidade, List<Musica> musicas, Date cadastro) {
		super();
		this.codigo = codigo;
		this.nomeArtistico = nomeArtistico;
		this.nacionalidade = nacionalidade;
		this.musicas = musicas;
		this.cadastro = cadastro;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeArtistico() {
		return nomeArtistico;
	}

	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public List<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}

	public Date getCadastro() {
		return cadastro;
	}

	public void setCadastro(Date cadastro) {
		this.cadastro = cadastro;
	}
		
	
}

*/