package br.com.alura.design.test;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.design.desconto.impl.CalculadoraDeDesconto;
import br.com.alura.design.model.Item;
import br.com.alura.design.model.Orcamento;

public class testaCalculadoraDesconto {

	public static void main(String[] args) {
		CalculadoraDeDesconto descontos = new CalculadoraDeDesconto();
		
		Orcamento orcamento = new Orcamento(500.0);
		List<Item> itens = new ArrayList<Item>();
		itens.add(new Item("CANETA", 250.0));
		itens.add(new Item("LAPIS", 250.0));
		itens.add(new Item("LAPIS", 250.0));
		itens.add(new Item("LAPIS", 250.0));
		itens.add(new Item("LAPIS", 250.0));
		itens.add(new Item("LAPIS", 250.0));
		orcamento.setItens(itens);
		
		Double desconto = descontos.calculaDesconto(orcamento);
		
		System.out.println("Desconto de : " + desconto);
		
	}
}
