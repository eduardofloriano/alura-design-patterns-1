package br.com.alura.design.test;

import br.com.alura.design.model.Orcamento;

public class testaEstadoOrcamento {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500.0);
		
		System.out.println("Orcamento está "+orcamento.getEstadoAtual().getClass().getSimpleName());
		System.out.println(orcamento.getValor());
		orcamento.aprova();
		System.out.println("Orcamento está "+orcamento.getEstadoAtual().getClass().getSimpleName());
		System.out.println(orcamento.getValor());
		orcamento.finaliza();
		System.out.println("Orcamento está "+orcamento.getEstadoAtual().getClass().getSimpleName());
		System.out.println(orcamento.getValor());
		orcamento.reprova();
		System.out.println("Orcamento está "+orcamento.getEstadoAtual().getClass().getSimpleName());
		System.out.println(orcamento.getValor());
	}

}
