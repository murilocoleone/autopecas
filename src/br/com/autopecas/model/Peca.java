package br.com.autopecas.model;

import br.com.autopecas.validadores.ValidaPeca;

/**
 * Classe que simula modelo de Peca da minha aplicacao.
 * @author Murilo
 *
 */

public class Peca {
	
	private String nome;
	private Double preco;
	private Integer quantidade;
	
	private ValidaPeca validador = new ValidaPeca();	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) { 
		validador.validaNome(nome);
		this.nome = nome;
	}	
	
	public Double getPreco() {
		return preco;
	}
		
	public void setPreco(Double preco) {
		validador.validaPreco(preco);		
		this.preco = preco;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(Integer quantidade){
		validador.validaQuantidade(quantidade);
		this.quantidade = quantidade;
	}		

}
