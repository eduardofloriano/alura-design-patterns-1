package br.com.alura.design.impl;

import br.com.alura.design.interfaces.EstadoOrcamento;
import br.com.alura.design.model.Orcamento;

public class EstadoEmAprovacao implements EstadoOrcamento {

	@Override
	public Double getValor(Orcamento orcamento) {		
		return orcamento.valor + (orcamento.valor * 0.05);
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.setEstadoAtual(new EstadoAprovado());
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.setEstadoAtual(new EstadoReprovado());
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.setEstadoAtual(new EstadoFinalizado());
		
	}

}
