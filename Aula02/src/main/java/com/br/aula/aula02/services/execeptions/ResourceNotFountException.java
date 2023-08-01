package com.br.aula.aula02.services.execeptions;

public class ResourceNotFountException extends RuntimeException{

	public ResourceNotFountException (Object id) {
		super("Resource not found exeception. Id: " + id);
	}
}
