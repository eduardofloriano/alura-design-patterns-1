package br.com.alura.design.model;

import br.com.alura.design.enums.FormatoEnum;

public class Conta {

	private String titular;
	private Double saldo;

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	
}