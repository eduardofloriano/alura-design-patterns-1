package br.com.alura.design.impl;

import br.com.alura.design.interfaces.EstadoOrcamento;
import br.com.alura.design.model.Orcamento;

public class EstadoReprovado implements EstadoOrcamento {

	@Override
	public Double getValor(Orcamento orcamento) {
		return orcamento.valor;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento j� Reprovado!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento j� Reprovado!");

	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.setEstadoAtual(new EstadoFinalizado());
	}

}
