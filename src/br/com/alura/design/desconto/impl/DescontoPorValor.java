package br.com.alura.design.desconto.impl;

import br.com.alura.design.interfaces.Desconto;
import br.com.alura.design.model.Orcamento;

public class DescontoPorValor implements Desconto {

	public Desconto proximoDesconto;
	
	@Override
	public Double aplicaDesconto(Orcamento orcamento) {

		if (orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.2;
		}

		return this.proximoDesconto.aplicaDesconto(orcamento);
	}

	
	@Override
	public void proximoDesconto(Desconto desconto) {
		this.proximoDesconto = desconto;
	}
}
