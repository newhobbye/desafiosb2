package br.com.accurate.desafiosb.exception;

import java.util.Date;

public class ErroMensagens {
	
	private Date dataAtual;
	private String nome;
	
	public ErroMensagens() {
		
	}
	
	public ErroMensagens(Date dataAtual, String nome) {
		this.dataAtual = dataAtual;
		this.nome = nome;
	}
	
	public Date getDataAtual() {
		return dataAtual;
	}
	public void setDataAtual(Date dataAtual) {
		this.dataAtual = dataAtual;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
