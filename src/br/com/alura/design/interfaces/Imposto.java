package br.com.alura.design.interfaces;

import br.com.alura.design.model.Orcamento;

public abstract class Imposto {

	public Imposto outroImposto;
	
	public Imposto(Imposto outroImposto){
		this.outroImposto = outroImposto;
	}
	
	public Imposto(){
		
	}
	
	
	public abstract double calcula(Orcamento orcamento);
	
	public double calculaOutroImposto(Orcamento orcamento){
		if(outroImposto == null) return 0;
		return this.outroImposto.calcula(orcamento);
	}
	
}
