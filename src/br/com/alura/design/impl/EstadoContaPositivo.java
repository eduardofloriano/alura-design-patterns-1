package br.com.alura.design.impl;

import br.com.alura.design.interfaces.EstadoConta;
import br.com.alura.design.model.Conta;

public class EstadoContaPositivo implements EstadoConta {

	@Override
	public void positivaConta(Conta conta) {
		throw new RuntimeException("Conta já está positiva!");
		
	}

	@Override
	public void negativaConta(Conta conta) {
		conta.setEstadoAtual(new EstadoContaNegativo());
		
	}

}
