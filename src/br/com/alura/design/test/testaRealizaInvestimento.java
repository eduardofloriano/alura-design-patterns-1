package br.com.alura.design.test;

import br.com.alura.design.interfaces.Investimento;
import br.com.alura.design.investimento.impl.Arrojado;
import br.com.alura.design.investimento.impl.Conservador;
import br.com.alura.design.investimento.impl.Moderado;
import br.com.alura.design.investimento.impl.RealizadorDeInvestimentos;
import br.com.alura.design.model.Orcamento;

public class testaRealizaInvestimento {

	public static void main(String[] args) {
		
		Investimento arrojado = new Arrojado();
		Investimento conservador = new Conservador();
		Investimento moderado = new Moderado();
		
		Orcamento orcamento = new Orcamento();
		orcamento.setValor(500.0);
		
		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();
		realizadorDeInvestimentos.realizaInvestimento(orcamento, conservador);
		realizadorDeInvestimentos.realizaInvestimento(orcamento, arrojado);
		realizadorDeInvestimentos.realizaInvestimento(orcamento, moderado);
		
		

	}

}
