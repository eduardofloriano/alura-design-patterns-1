package br.com.alura.design.test;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.design.imposto.impl.CalculadorDeImpostos;
import br.com.alura.design.imposto.impl.ICPP;
import br.com.alura.design.imposto.impl.IKCV;
import br.com.alura.design.interfaces.Imposto;
import br.com.alura.design.model.Item;
import br.com.alura.design.model.Orcamento;

public class testaCalculadorImposto {

	public static void main(String[] args) {
		
		Imposto icpp = new ICPP();
		Imposto ikcv = new IKCV();
				
		Orcamento orcamento = new Orcamento();
		orcamento.setValor(600.0);
		List<Item> itens = new ArrayList<Item>();
		itens.add(new Item("CANETA", 90.0));
		itens.add(new Item("LAPIS", 25.0));
		orcamento.setItens(itens);
		
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		calculador.realizaCalculo(orcamento, icpp);
		calculador.realizaCalculo(orcamento, ikcv);
		

	}

}
