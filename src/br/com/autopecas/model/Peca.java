package br.com.autopecas.model;

public class Peca {
	
	private String nome;
	private Double preco;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) { 
		validaNome(nome);
		this.nome = nome;
	}	
		

	public void setPreco(Double preco) {
		validaPreco(preco);		
		this.preco = preco;
	}
		
	public Double getPreco() {
		return preco;
	}
	
	private void validaNome(String nome){		
		if(nome == null || nome.equals("")){
			throw new IllegalArgumentException("Valor de nome invalido");
		}		
	}
	
	private void validaPreco(Double valor) {
		if(valor == null || valor <= 0)
			throw new IllegalArgumentException("Valor peca invalido");
	}

}
