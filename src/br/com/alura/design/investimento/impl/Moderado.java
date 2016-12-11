package br.com.alura.design.investimento.impl;

import br.com.alura.design.interfaces.Investimento;
import br.com.alura.design.model.Orcamento;

public class Moderado implements Investimento{

	@Override
	public Double investe(Orcamento orcamento) {
		
		double chance = new java.util.Random().nextDouble();
		
		if(chance <= 0.50){
			return orcamento.getValor() * 0.25;
		}else{
			return orcamento.getValor() * 0.7;
		}
	}

	
	
	
}
