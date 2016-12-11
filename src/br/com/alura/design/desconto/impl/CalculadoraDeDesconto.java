package br.com.alura.design.desconto.impl;

import br.com.alura.design.interfaces.Desconto;
import br.com.alura.design.model.Orcamento;

public class CalculadoraDeDesconto {
	
	public Double calculaDesconto(Orcamento orcamento){
		
		Desconto d1 = new DescontoPorQuantidadeItens();
		Desconto d2 = new DescontoPorValor();
		Desconto d3 = new SemDesconto();
		
		d1.proximoDesconto(d2);
		d2.proximoDesconto(d3);
		
		return d1.aplicaDesconto(orcamento);
		
	}
}
