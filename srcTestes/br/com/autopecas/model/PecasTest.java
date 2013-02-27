package br.com.autopecas.model;

/**
 * Classe de teste para classe de negocio Peca.
 * Testes realizados o o framework JUnit4.
 * @author Murilo
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PecasTest {

	private Peca peca;
	
	@Before
	public void setUp(){
		peca = new Peca();
	}
	
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
	
	@Test
	public void testValorParaQuantidadePeca(){
		final int quantidade = 12;
		peca.setQuantidade(quantidade);
		assertEquals("Quantidade deveria ser 12", new Integer(12), peca.getQuantidade());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSeLancaIllegalArgumentExceptionComValorNegativoParaQuantidadePeca(){
		final int quantidade = -1;
		peca.setQuantidade(quantidade);		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSeLancaIllegalArgumentExceptionComValorNullParaQuantidadePeca(){
		final Integer quantidade = null;
		peca.setQuantidade(quantidade);
	}

}
