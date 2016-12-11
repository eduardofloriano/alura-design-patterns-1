package br.com.alura.design.imposto.impl;

import br.com.alura.design.interfaces.Imposto;
import br.com.alura.design.model.Orcamento;

public class ICCC implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		
		double valor = orcamento.getValor();
		
		if(valor < 1000){
			valor = valor * 0.5;
		}else if(valor > 1000 && valor < 3000){
			valor = valor * 0.7;
		}else if(valor > 3000){
			valor = valor * 0.8 + 30.0;
		}
		
		return valor;
	}

}
