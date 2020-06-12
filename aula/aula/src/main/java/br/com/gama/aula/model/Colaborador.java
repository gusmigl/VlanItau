package br.com.gama.aula.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @see br.com.gama.CantorDAO.UsuarioDAO
 * @author LeP
 * @version 1.0 
 */
@Entity // para representar que a classe contem um correspondente no banco
@Table(name="TB_AULA_COLABORADORES")

public class Colaborador {
	@Column(name="ID")
	@Id // para indicar que a coluna eh a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)   //IDENTITY representa que deixaremos a coluna com auto incremnto/ auto numeracao
	private int id;

	@Column(name="RACF", length=7)
	private String racf;
	
	@Column(name="EMAIL", length=50)
	private String email;
	
	@Column(name="NOME", length=40)
	private String nome;

	@Column(name="FOTO", length=100)
	private String foto;
	
	@Column(name="NUMSERI")
	private int numseri;
	
	@Column(name="DESCRICAO", length=100)
	private String descricao;
	
	@Column(name="NUMCONECTOR", length=20)
	private String numconector;
	
	@Column(name="SENHA", length=15)
	private String senha;

	@JsonIgnoreProperties("colaborador")
	@ManyToOne  //o dado esta em Artista
	private Departamento departamento;
	
	/*
	@JsonIgnoreProperties("colaborador")
	@OneToMany(cascade=CascadeType.ALL , mappedBy="colaborador")
	private List<Solicitacao> solicitacoes;
	 */

	public Colaborador(int id, String racf, String email, String nome, String foto, int numseri, String descricao,
			String numconector, String senha, Departamento departamento) {
		super();
		this.id = id;
		this.racf = racf;
		this.email = email;
		this.nome = nome;
		this.foto = foto;
		this.numseri = numseri;
		this.descricao = descricao;
		this.numconector = numconector;
		this.senha = senha;
		this.departamento = departamento;
		
	}


	public Colaborador() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getRacf() {
		return racf;
	}


	public void setRacf(String racf) {
		this.racf = racf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


	public int getNumseri() {
		return numseri;
	}


	public void setNumseri(int numseri) {
		this.numseri = numseri;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getNumconector() {
		return numconector;
	}


	public void setNumconector(String numconector) {
		this.numconector = numconector;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}




	
	
	
	

}
