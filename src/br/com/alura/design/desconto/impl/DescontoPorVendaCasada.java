package br.com.alura.design.desconto.impl;

import br.com.alura.design.interfaces.Desconto;
import br.com.alura.design.model.Item;
import br.com.alura.design.model.Orcamento;

public class DescontoPorVendaCasada implements Desconto {

	public Desconto proximo;
	
	@Override
	public Double aplicaDesconto(Orcamento orcamento) {
		
		if(existe("LAPIS", orcamento)){
			if(existe("CANETA", orcamento)){
				return orcamento.getValor() * 0.05;
			}
			
		}
		
		return proximo.aplicaDesconto(orcamento);
	}

	@Override
	public void proximoDesconto(Desconto desconto) {
		this.proximo = desconto;
		
	}
	
	private boolean existe(String nomeDoItem, Orcamento orcamento){
		
		for(Item item : orcamento.getItens()){
			if(item.getNome().equals(nomeDoItem)){
				return true;
			}
		}
		
		return false;
		
	}

}
