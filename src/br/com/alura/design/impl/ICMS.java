package br.com.alura.design.impl;

import br.com.alura.design.interfaces.Imposto;
import br.com.alura.design.model.Orcamento;

public class ICMS implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;		
	}

}
