package br.com.gama.aula.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_AULA_DEPARTAMENTOS")

public class Departamento {
	
	@Column(name="CODIGO")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name="NOMEDEPTO", length=40)
	private String nomedepto;
	
	@Column(name="NMVLAN", length=40)
	private String nmvlan;
	
	@Column(name="ENDBASE", length=40)
	private String endbase;

	public Departamento(int codigo, String nomedepto, String nmvlan, String endbase) {
		super();
		this.codigo = codigo;
		this.nomedepto = nomedepto;
		this.nmvlan = nmvlan;
		this.endbase = endbase;
	}

	public Departamento() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomedepto() {
		return nomedepto;
	}

	public void setNomedepto(String nomedepto) {
		this.nomedepto = nomedepto;
	}

	public String getNmvlan() {
		return nmvlan;
	}

	public void setNmvlan(String nmvlan) {
		this.nmvlan = nmvlan;
	}

	public String getEndbase() {
		return endbase;
	}

	public void setEndbase(String endbase) {
		this.endbase = endbase;
	}
	
	
	

}
