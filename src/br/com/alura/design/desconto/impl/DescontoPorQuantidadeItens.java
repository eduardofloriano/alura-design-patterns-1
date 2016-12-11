package br.com.alura.design.desconto.impl;

import br.com.alura.design.interfaces.Desconto;
import br.com.alura.design.model.Orcamento;

public class DescontoPorQuantidadeItens implements Desconto{

	public Desconto proximoDesconto;
	
	@Override
	public Double aplicaDesconto(Orcamento orcamento) {
		
		if(orcamento.getItens().size() > 5){
			return orcamento.getValor() * 0.1;
		}

		return proximoDesconto.aplicaDesconto(orcamento);
		
	}

	@Override
	public void proximoDesconto(Desconto desconto) {
		this.proximoDesconto = desconto;
	}

}
