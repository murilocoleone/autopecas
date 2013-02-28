package br.com.autopecas.validadores;

public class ValidadorPeca implements Validador {

	private static final String PROPR_NOME = "nome", PROPR_PRECO = "preco", PROPR_QUANTIDADE = "quantidade";
	
	public void valida(String propr, Object valorPorpr) {
		try {
			switch (propr) {
			case PROPR_NOME:
				validaNome((String) valorPorpr);
				break;
			case PROPR_PRECO:
				validaPreco((Double) valorPorpr);
				break;
			case PROPR_QUANTIDADE:
				validaQuantidade((Integer) valorPorpr);
				break;
			default:
				throw new ValidadorIllegalArgumentException("Propriedade "
						+ propr + " desconhecida.");
			}
		} catch (ClassCastException classCastEx) {
			throw new ValidadorIllegalArgumentException("Tipo de dado "
					+ valorPorpr.getClass().getName() + " nao suportador.");
		}catch(NullPointerException nullPointerEx){
			throw new ValidadorIllegalArgumentException("O valor da propriedade nao pode ser null.");
		}
	}

	void validaNome(String nome) {
		if (nome == null || nome.equals("")) {
			throw new ValidadorIllegalArgumentException("Nome peca invalido.");
		}
	}

	void validaPreco(Double valor) {
		if (valor == null || valor <= 0)
			throw new ValidadorIllegalArgumentException("Valor peca invalido.");
	}

	void validaQuantidade(Integer quantidade) {
		if (quantidade == null || quantidade < 0)
			throw new ValidadorIllegalArgumentException("Quantidade peca inlivado");
	}

}
