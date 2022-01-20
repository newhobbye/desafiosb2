package br.com.accurate.desafiosb.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AchadosPerdidos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String categoria;
	private String bairro;

	public AchadosPerdidos() {

	}

	public AchadosPerdidos(String nome, String categoria, String bairro) {
		this.nome = nome;
		this.categoria = categoria;
		this.setBairro(bairro);
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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;

	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public String toString() {
		return "AchadosPerdidos [id=" + id + ", nome=" + nome + ", categoria=" + categoria + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AchadosPerdidos other = (AchadosPerdidos) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
