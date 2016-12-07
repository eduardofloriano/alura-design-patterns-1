package br.com.alura.design.imposto.impl;

import br.com.alura.design.interfaces.Imposto;
import br.com.alura.design.model.Orcamento;

public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto){
		
		double valor = imposto.calcula(orcamento);
		System.out.println(valor);
		
	}
	
}
