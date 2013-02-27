package br.com.autopecas.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class PecasTest {

	private Peca peca = new Peca();
	
	@Test(expected=IllegalArgumentException.class)
	public void testSeLancaIllegalArgumentExceptionComNomePecaNull(){	
		final String nome = null;
		peca.setNome(nome);						
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSeLancaIllegalArgumentExceptionComValorNomePecaVazio(){
		final String nome = "";
		peca.setNome(nome);				
	}		
	
	@Test
	public void testValorNomePeca(){
		final String nome = "Retrovisor";
		peca.setNome(nome);
		assertEquals("Valor de nome deveria ser Retrovisor", "Retrovisor", peca.getNome());		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSeLancaIllegalArgumentExceptionComPrecoPecaNull(){
		final Double valor = null;
		peca.setPreco(valor);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSeLancaIllegalArgumentExceptionComPrecoPecaZero(){
		final Double valor = 0d;
		peca.setPreco(valor);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSeLancaIllegalArgumentExceptionComPrecoPecaNegativo(){
		final Double valor = -1d;
		peca.setPreco(valor);
	}
	
	@Test
	public void testValorCinquentaParaPrecoPeca(){
		final Double valor = 50d;
		peca.setPreco(valor);
		assertEquals("Deveria ser o valor 50", new Double(50), peca.getPreco());
	}
	
	@Test
	public void testValorCemPontoNoveParaPrecoPeca(){
		final Double valor = 100.9d;
		peca.setPreco(valor);
		assertEquals("Deveria ser o valor 100.9", new Double(100.9), peca.getPreco());
	}
	
	@Test
	public void testValorDuzentosParaPrecoPeca(){
		final Double valor = 200d;
		peca.setPreco(valor);
		assertEquals("Valor deveria ser 200", new Double(200), peca.getPreco());
	}

}
