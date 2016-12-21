package br.com.alura.design.impl;

import br.com.alura.design.interfaces.EstadoOrcamento;
import br.com.alura.design.model.Orcamento;

public class EstadoFinalizado implements EstadoOrcamento {

	@Override
	public Double getValor(Orcamento orcamento) {
		return orcamento.valor;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento já está finalizado!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento já está finalizado!");

	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orcamento já está finalizado!");

	}

}
