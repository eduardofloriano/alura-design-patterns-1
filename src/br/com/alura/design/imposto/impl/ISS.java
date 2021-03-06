package br.com.alura.design.imposto.impl;

import br.com.alura.design.interfaces.Imposto;
import br.com.alura.design.model.Orcamento;

public class ISS extends Imposto{

	public ISS(Imposto outroImposto){
		super(outroImposto);
	}
	
	public ISS(){
		
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculaOutroImposto(orcamento);		
	}


}
