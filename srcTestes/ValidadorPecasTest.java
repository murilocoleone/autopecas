import org.junit.Before;
import org.junit.Test;

import br.com.autopecas.validadores.ValidaPeca;
import static org.junit.Assert.*;

public class ValidadorPecasTest {

	private ValidaPeca validadorDePeca;
	
	@Before
	public void setUp(){
		validadorDePeca = new ValidaPeca();
	}
	
	@Test
	public void testValidaNomeComValorAceitavelNaoDeveLancarIllegalArgumentException(){
		final String nome = "Volante";
		validadorDePeca.validaNome(nome);
		assertTrue(true);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testValidaNomeComValorVazioDeveLancarIllegalArgumentException(){
		final String nome = "";
		validadorDePeca.validaNome(nome);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testValidaNomeComValorNullDeveLancarIllegalArgumentException(){
		final String nome = null;
		validadorDePeca.validaNome(nome);
	}
	
}
