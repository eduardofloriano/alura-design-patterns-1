package br.com.alura.design.imposto.impl;

import br.com.alura.design.interfaces.Imposto;
import br.com.alura.design.model.Orcamento;

public class ICMS extends Imposto{

	public ICMS(Imposto outroImposto){
		super(outroImposto);
	}
	
	public ICMS(){
		
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1 + calculaOutroImposto(orcamento);		
	}

}
