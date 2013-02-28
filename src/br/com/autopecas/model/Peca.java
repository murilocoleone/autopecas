package br.com.autopecas.model;

import br.com.autopecas.validadores.Validador;
import br.com.autopecas.validadores.ValidadorPeca;

/**
 * Classe que simula modelo de Peca da minha aplicacao.
 * @author Murilo
 *
 */

public class Peca {
	
	private String nome;
	private Double preco;
	private Integer quantidade;
	
	private Validador validador = new ValidadorPeca();	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) { 
		validador.valida("nome", nome);
		this.nome = nome;
	}	
	
	public Double getPreco() {
		return preco;
	}
		
	public void setPreco(Double preco) {
		validador.valida("preco", preco);		
		this.preco = preco;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(Integer quantidade){
		validador.valida("quantidade", quantidade);
		this.quantidade = quantidade;
	}		

}
