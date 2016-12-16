package br.com.alura.design.impl;

import java.util.List;

import br.com.alura.design.model.Conta;
import br.com.alura.design.template.TemplateRelatorio;

public class RelatorioSimplesImpl extends TemplateRelatorio{

	@Override
	public void cabecalho() {
		System.out.println("BANCO BRADESCO");
		
	}

	@Override
	public void rodape() {
		System.out.println("0800-0569956");
		
	}

	@Override
	public void corpo(List<Conta> contas) {
		
		for(Conta conta : contas){
			System.out.println("Titular: " + conta.getTitular());
		}
		
	}

}
