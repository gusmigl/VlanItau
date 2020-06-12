/*
package br.com.gama.aula.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name="TB_AULA_MUSICAS")
	public class Musica {
	
		@Column(name="CODIGO")
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int codigo;
		
		@Column(name="TITULO", length=40)
		private String titulo;
		
		@Column(name="ANO")
		private int ano;
		
		@JsonIgnoreProperties("musicas")
		@ManyToOne  //o dado esta em Artista
		private Artista artista;
		
				
		public Musica() {
			super();
		}
		public Musica(int codigo, String titulo, int ano, Artista artista) {
			super();
			this.codigo = codigo;
			this.titulo = titulo;
			this.ano = ano;
			this.artista = artista;
		}
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
		public Artista getArtista() {
			return artista;
		}
		public void setArtista(Artista artista) {
			this.artista = artista;
		}

}
*/