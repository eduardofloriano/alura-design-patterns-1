package br.com.alura.design.investimento.impl;

import br.com.alura.design.interfaces.Investimento;
import br.com.alura.design.model.Orcamento;

public class RealizadorDeInvestimentos {

	
	public void realizaInvestimento(Orcamento orcamento, Investimento investimento){		
		System.out.println(investimento.investe(orcamento));;
		
	}
	
}
