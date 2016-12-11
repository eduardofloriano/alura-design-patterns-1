package br.com.alura.design.desconto.impl;

import br.com.alura.design.interfaces.Desconto;
import br.com.alura.design.model.Orcamento;

public class SemDesconto implements Desconto{

	public Desconto proximoDesconto;
	
	@Override
	public Double aplicaDesconto(Orcamento orcamento) {		
		return 0.0;
		
	}

	@Override
	public void proximoDesconto(Desconto desconto) {
		return;
	}

}
