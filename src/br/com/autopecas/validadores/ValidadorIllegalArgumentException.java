package br.com.autopecas.validadores;

public class ValidadorIllegalArgumentException extends IllegalArgumentException {

	private static final long serialVersionUID = 1L;

	public ValidadorIllegalArgumentException(String msg){
		super(msg);
	}
	
	public ValidadorIllegalArgumentException(){
		super();
	}
	
}
