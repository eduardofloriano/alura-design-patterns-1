package br.com.alura.design.model;

import java.util.List;

public class Orcamento {
	
	private Double valor;	
	private List<Item> itens;

	public Orcamento(){
	}
	
	public Orcamento(double valor){
		this.valor= valor;
	}
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	
	
}
