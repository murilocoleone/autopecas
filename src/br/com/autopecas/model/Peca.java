package br.com.autopecas.model;

/**
 * Classe que simula modelo de Peca da minha aplicacao.
 * @author Murilo
 *
 */

public class Peca {
	
	private String nome;
	private Double preco;
	
	/**
	 * 
	 * @return String nome
	 */
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) { 
		validaNome(nome);
		this.nome = nome;
	}	
	
	
	/**
	 * 
	 * @return Double preco
	 */
	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		validaPreco(preco);		
		this.preco = preco;
	}		
	
	private void validaNome(String nome){		
		if(nome == null || nome.equals("")){
			throw new IllegalArgumentException("Valor de nome invalido.");
		}		
	}
	
	private void validaPreco(Double valor) {
		if(valor == null || valor <= 0)
			throw new IllegalArgumentException("Valor peca invalido.");
	}

}
