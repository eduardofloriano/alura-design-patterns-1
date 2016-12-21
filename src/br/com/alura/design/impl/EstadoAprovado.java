package br.com.alura.design.impl;

import br.com.alura.design.interfaces.EstadoOrcamento;
import br.com.alura.design.model.Orcamento;

public class EstadoAprovado implements EstadoOrcamento {

	@Override
	public Double getValor(Orcamento orcamento) {
		return orcamento.valor + (orcamento.valor * 0.02);
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento já está aprovado!");

	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento já está aprovado!");

	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.setEstadoAtual(new EstadoFinalizado());
	}

}
