/*
package br.com.gama.aula.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @see br.com.gama.CantorDAO.UsuarioDAO
 * @author LeP
 * @version 1.0 
 */
/*
@Entity // para representar que a classe contem um correspondente no banco
@Table(name="TB_AULA_COLABORADORES")

public class Usuario {
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
	
	
	
	
	public Usuario(int id, String nome, String email, String senha, String foto) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.foto = foto;
	}

	public Usuario() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
		

}
*/