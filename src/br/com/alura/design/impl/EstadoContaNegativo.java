package br.com.alura.design.impl;

import br.com.alura.design.interfaces.EstadoConta;
import br.com.alura.design.model.Conta;

public class EstadoContaNegativo implements EstadoConta {

	@Override
	public void positivaConta(Conta conta) {
		conta.setEstadoAtual(new EstadoContaPositivo());

	}

	@Override
	public void negativaConta(Conta conta) {
		throw new RuntimeException("Conta já está Negativa!");

	}

}
