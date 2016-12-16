package br.com.alura.design.test;

import br.com.alura.design.imposto.impl.ICCC;
import br.com.alura.design.imposto.impl.ICMS;
import br.com.alura.design.interfaces.Imposto;
import br.com.alura.design.model.Orcamento;

public class testeCalculadorImpostoComplexo {

	
	public static void main(String[] args) {
		
		Imposto iccc = new ICCC(new ICMS());
		
		Orcamento orcamento = new Orcamento(500.0);
		
		
		System.out.println(iccc.calcula(orcamento));
		
		
	}
}
