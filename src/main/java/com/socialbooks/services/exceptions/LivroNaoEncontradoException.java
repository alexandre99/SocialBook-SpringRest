package com.socialbooks.services.exceptions;

public class LivroNaoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = -7327624132079168877L;

	public LivroNaoEncontradoException(String mensagem) {

		super(mensagem);

	}

	public LivroNaoEncontradoException(String mensagem, Throwable causa) {

		super(mensagem, causa);

	}

}
