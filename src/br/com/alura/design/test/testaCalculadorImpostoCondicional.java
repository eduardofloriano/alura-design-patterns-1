package br.com.alura.design.test;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.design.imposto.impl.CalculadorDeImpostos;
import br.com.alura.design.imposto.impl.ICCC;
import br.com.alura.design.imposto.impl.ICMS;
import br.com.alura.design.imposto.impl.IHIT;
import br.com.alura.design.imposto.impl.ISS;
import br.com.alura.design.interfaces.Imposto;
import br.com.alura.design.model.Item;
import br.com.alura.design.model.Orcamento;

public class testaCalculadorImpostoCondicional {

	public static void main(String[] args) {
		
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto iccc = new ICCC();
		Imposto ihit = new IHIT();
		
		Orcamento orcamento = new Orcamento();
		orcamento.setValor(500.0);
		List<Item> itens = new ArrayList<Item>();
		itens.add(new Item("CANETA", 90.0));
		itens.add(new Item("CANETA", 25.0));
		itens.add(new Item("LAPIS", 25.0));
		orcamento.setItens(itens);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		calculador.realizaCalculo(orcamento, ihit);

	}

}
