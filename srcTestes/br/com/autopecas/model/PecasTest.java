package br.com.autopecas.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class PecasTest {

	private Peca peca = new Peca();
	
	@Test(expected=IllegalArgumentException.class)
	public void testSePecaLancaIllegalArgumentExceptionComNomeNull(){	
		final String nome = null;
		peca.setNome(nome);						
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSePecaLancaIllegalArgumentExceptionComValorNomeVazio(){
		final String nome = "";
		peca.setNome(nome);				
	}		
	
	@Test
	public void testValorNome(){
		final String nome = "Retrovisor";
		peca.setNome(nome);
		assertEquals("Valor de nome deveria ser Retrovisor", "Retrovisor", peca.getNome());		
	}

}
