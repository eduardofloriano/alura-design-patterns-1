package br.com.alura.design.test;

import br.com.alura.design.imposto.impl.CalculadorDeImpostos;
import br.com.alura.design.imposto.impl.ICCC;
import br.com.alura.design.imposto.impl.ICMS;
import br.com.alura.design.imposto.impl.ISS;
import br.com.alura.design.interfaces.Imposto;
import br.com.alura.design.model.Orcamento;

public class testaCalculadorImposto {

	public static void main(String[] args) {
		
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto iccc = new ICCC();
		
		Orcamento orcamento = new Orcamento();
		orcamento.setValor(500.0);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, icms);
		calculador.realizaCalculo(orcamento, iccc);

	}

}
