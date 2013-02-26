package br.com.autopecas.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class PecasTest {

	private Peca peca = new Peca();
	
	@Test
	public void testeSeNomePecaRejeitaValorNull(){		
		
		try{
			peca.setNome(null);
			fail("Deveria ter lancado uma NullPointerException");
		}catch(IllegalArgumentException ex){					
			assertTrue(true);
		}
		
	}
	
	@Test
	public void testeSeNomePecaRejeitaValorVazio(){
		
		try{
			peca.setNome("");
			fail("Deveria ter lancado uma IllegalArgumentException");
		}catch(IllegalArgumentException ex){
			assertTrue(true);
		}
		
	}	
	
	@Test
	public void testeValorNome(){
				
		peca.setNome("Retrovisor");
		assertEquals("Valor de nome deveria ser Retrovisor", "Retrovisor", peca.nome);
		
	}

}
