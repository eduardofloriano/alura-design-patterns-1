package br.com.alura.design.investimento.impl;

import br.com.alura.design.interfaces.Investimento;
import br.com.alura.design.model.Orcamento;

public class Conservador implements Investimento{

	@Override
	public Double investe(Orcamento orcamento) {
		
		return orcamento.getValor() * 0.08;
	}

}
