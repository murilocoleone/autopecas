package br.com.autopecas.validadores;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidadorPecasTest {
	
	private Validador validadorPeca;
	
	@Before
	public void setUp(){
		validadorPeca = new ValidadorPeca();
	}
		
	@Test(expected=IllegalArgumentException.class)
	public void testValidaNomePecaVazioDeveLancarIllegalArgumentException(){
		final String nome = "";
		((ValidadorPeca)validadorPeca).validaNome(nome);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testValidaNomePecaNullDeveLancarIllegalArgumentException(){
		final String nome = null;
		((ValidadorPeca)validadorPeca).validaNome(nome);
	}
	
	@Test
	public void testValidaNomePecaAceitavelNaoDeveLancarIllegalArgumentException(){
		final String nome = "Volante";
		try{
			((ValidadorPeca)validadorPeca).validaNome(nome);
			assertTrue(true);
		}catch(IllegalArgumentException illegalArgEx){
			fail("Nao devia lancar IllegalArgumentException");
		}
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testValidaPrecoPecaZeroDeveLancarIllegalArgumentException(){
		final Double precoZero = 0.0;
		((ValidadorPeca)validadorPeca).validaPreco(precoZero);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testValidaPrecoPecaNegativoDeveLancarIllegalArgumentException(){
		final Double precoNegativo = -1d;
		((ValidadorPeca)validadorPeca).validaPreco(precoNegativo);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testValidaPrecoPecaNullDeveLancarIllegalArgumentException(){
		final Double precoNull = null;
		((ValidadorPeca)validadorPeca).validaPreco(precoNull);
	}
	
	@Test
	public void testValidaPrecoPecaAceitavelNaoDeveLancarIllegalArgumentException(){
		final Double precoAceitavel = 100.12;
		((ValidadorPeca)validadorPeca).validaPreco(precoAceitavel);		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testValidaQuantidadePecaNegativoDeveLancarIllegalArgumentException(){
		final Integer quantidadeNegativa = -1;
		((ValidadorPeca)validadorPeca).validaQuantidade(quantidadeNegativa);
	}
	
	@Test
	public void testValidaQuantidadePecaZeroNaoDeveLancarIllegalArgumentException(){
		final Integer quantidadeZero = 0;
		((ValidadorPeca)validadorPeca).validaQuantidade(quantidadeZero);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testValidaQuantidadePecaNullDeveLancarIllegalArgumentException(){
		final Integer quantidadeNull = null;
		((ValidadorPeca)validadorPeca).validaQuantidade(quantidadeNull);
	}
	
	@Test
	public void testValidaQuantidadePecaPositivaNaoDeveLancarIllegalArgumentException(){
		final Integer quantidadePositiva = 10;
		((ValidadorPeca)validadorPeca).validaQuantidade(quantidadePositiva);
	}
	
	@Test
	public void testValidaComProprNomeAceitavelNaoDeveLancarIllegalArgumentException(){
		final String propr = "nome", nome = "Mauro";
		validadorPeca.valida(propr, nome);
	}
	
	@Test
	public void testValidaComProprPrecoAceitavelNaoDeveLancarIllegalArgumentException(){
		final String propr = "preco";
		final Double preco = 100.9;
		validadorPeca.valida(propr, preco);
	}
	
	@Test
	public void testValidaComProprQuantidadeAceitavelNaoDeveLancarIllegalArgumentException(){
		final String propr = "quantidade";
		final Integer quantidade = 2;
		validadorPeca.valida(propr, quantidade);
	}
	
	@Test(expected=ValidadorIllegalArgumentException.class)
	public void testValidaComNomeProprInvalidaDeveLancarProprValidadorIllegalArgumentException(){
		final String proprInvalida = "idade";
		final Double preco = 10d;
		validadorPeca.valida(proprInvalida, preco);
	}
	
	@Test(expected=ValidadorIllegalArgumentException.class)
	public void testValidaComTipoValorInvalidoDeveLancarValidadorIllegalArgumentException(){
		final String propr = "nome";
		final StringBuilder tipoValorInvalido = new StringBuilder();
		validadorPeca.valida(propr, tipoValorInvalido);
	}
	
	@Test(expected=ValidadorIllegalArgumentException.class)	
	public void testValidaComTipoValorInvalidoEProprInvalidaDeveLancarValidatorIllegalArgumentException(){
		final String proprInvalida = "altura";
		final StringBuilder tipoValorInvalido = new StringBuilder();
		validadorPeca.valida(proprInvalida, tipoValorInvalido);
	}
	
	@Test(expected=ValidadorIllegalArgumentException.class)
	public void testValidaComValorNullDeveLancarValidadorIllegalArgumentException(){
		final String propr = "nome";
		final String nome = null;
		validadorPeca.valida(propr, nome);
	}
	
	@Test(expected=ValidadorIllegalArgumentException.class)
	public void testValidaComProprNullDeveLancarValidadorIllegalArgumentException(){
		final String propr = null;
		final Double preco = 10d;
		validadorPeca.valida(propr, preco);
	}
	
}
