package br.com.autopecas.validadores;

public class ValidaPeca {

	public void validaNome(String nome){		
		if(nome == null || nome.equals("")){
			throw new IllegalArgumentException("Nome peca invalido.");
		}		
	}
	
	public void validaPreco(Double valor) {
		if(valor == null || valor <= 0)
			throw new IllegalArgumentException("Valor peca invalido.");
	}
	
	public void validaQuantidade(Integer quantidade){
		if(quantidade == null || quantidade < 0)
			throw new IllegalArgumentException("Quantidade peca inlivado");
	}
	
}
