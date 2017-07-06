package com.socialbooks.services.exceptions;

public class AutorExistenteException extends RuntimeException {

	private static final long serialVersionUID = -7327624132079168877L;

	public AutorExistenteException(String mensagem) {

		super(mensagem);

	}

	public AutorExistenteException(String mensagem, Throwable causa) {

		super(mensagem, causa);

	}

}
