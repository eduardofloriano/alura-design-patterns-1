package br.com.alura.design.impl;

import java.util.List;

import br.com.alura.design.model.Conta;
import br.com.alura.design.template.TemplateRelatorio;

public class RelatorioComplexoImpl extends TemplateRelatorio{

	@Override
	public void cabecalho() {
		System.out.println("BANCO BRADESCO");
		System.out.println("RUA CORONEL JOSE VICENTE - LORENA");
		System.out.println("0800-0569956");
		
	}

	@Override
	public void rodape() {
		System.out.println("devluiseduardo@gmail.com");
		System.out.println("12/12/2016");
		
	}

	@Override
	public void corpo(List<Conta> contas) {
		
		for(Conta conta : contas){
			System.out.println("Titular: " + conta.getTitular() + " / Saldo: " + conta.getSaldo());
		}
	}

}
