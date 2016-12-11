package br.com.alura.design.interfaces;

import br.com.alura.design.model.Orcamento;

public interface Desconto {

	public Double aplicaDesconto(Orcamento orcamento);
	
	public void proximoDesconto(Desconto desconto);
	
}
