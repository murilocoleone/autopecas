package br.com.autopecas.model;

public class Peca {
	
	private String nome; 
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) { 
		validaNome(nome);
		this.nome = nome;
	}
	
	private void validaNome(String nome){		
		if(nome == null || nome.equals("")){
			throw new IllegalArgumentException();
		}		
	}

}
