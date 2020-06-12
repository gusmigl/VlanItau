
 
package br.com.gama.aula.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity 
@Table(name="TB_AULA_SOLICITACOES")

public class Solicitacao {
	@Column(name="ID")
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)   
	private int Id;
	
	@Column(name="DATA")
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	public Date data;
	
	@JsonIgnoreProperties("solicitacao")
	@ManyToOne  //o dado esta em Artista
	private Colaborador colaborador;
	
	@JsonIgnoreProperties("solicitacao")
	@ManyToOne  //o dado esta em Artista
	private Departamento deptoatual;
	
	@JsonIgnoreProperties("solicitacao")
	@ManyToOne  //o dado esta em Artista
	private Departamento deptonovo;
		
	@Column(name="COMANDO", length=200)
	private String comando;
	
	@Column(name="JUSTIFICATIVA", length=200)
	private String justificativa;

	public Solicitacao(int id, Date data, Colaborador colaborador, Departamento deptoatual, Departamento deptonovo,
			String comando, String justificativa) {
		super();
		Id = id;
		this.data = data;
		this.colaborador = colaborador;
		this.deptoatual = deptoatual;
		this.deptonovo = deptonovo;
		this.comando = comando;
		this.justificativa = justificativa;
	}

	public Solicitacao() {
		super();
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public Departamento getDeptoatual() {
		return deptoatual;
	}

	public void setDeptoatual(Departamento deptoatual) {
		this.deptoatual = deptoatual;
	}

	public Departamento getDeptonovo() {
		return deptonovo;
	}

	public void setDeptonovo(Departamento deptonovo) {
		this.deptonovo = deptonovo;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
	
	public String getComando() {
		return comando;
	}

	public void setComando(String comando) {
		this.comando = comando;
	}

	
}

