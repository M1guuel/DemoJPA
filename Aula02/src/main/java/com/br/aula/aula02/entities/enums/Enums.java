package com.br.aula.aula02.entities.enums;

public enum Enums {
	WAITIN_PAYMENT(1), PAID(2), SHIPPED(2), DELIVERED(4), CANCELED(5);

	private int code;

	private Enums(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static Enums valueOf(int code) {
		for (Enums value : Enums.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Codigo invalido: "+ code);
	}
}
