package br.com.alura.design.investimento.impl;

import br.com.alura.design.interfaces.Investimento;
import br.com.alura.design.model.Orcamento;

public class Arrojado implements Investimento{

	@Override
	public Double investe(Orcamento orcamento) {
		
		double chance = new java.util.Random().nextDouble();
		
		if(chance <= 0.20){
			return orcamento.getValor() * 0.5;
		}else if (chance <= 0.50){
			return orcamento.getValor() * 0.3;
		}else {
			return orcamento.getValor() * 0.06;
		}
	}

	
	
	
}
