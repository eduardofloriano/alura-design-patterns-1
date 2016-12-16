package br.com.alura.design.imposto.impl;

import br.com.alura.design.interfaces.Imposto;
import br.com.alura.design.model.Orcamento;

public class ImpostoMuitoAlto extends Imposto{

	public ImpostoMuitoAlto(Imposto outroImposto){
		super(outroImposto);
	}
	
	public ImpostoMuitoAlto(){
		
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.02 + calculaOutroImposto(orcamento);		
	}


}
