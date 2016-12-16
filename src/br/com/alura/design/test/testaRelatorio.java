package br.com.alura.design.test;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.design.impl.RelatorioComplexoImpl;
import br.com.alura.design.impl.RelatorioSimplesImpl;
import br.com.alura.design.model.Conta;
import br.com.alura.design.template.TemplateRelatorio;

public class testaRelatorio {
	
	public static void main(String[] args) {
		
		List<Conta> contas = new ArrayList<Conta>();
		contas.add(createConta("Luis Eduardo", 250.0));
		contas.add(createConta("Roberto Lajes", 550.0));
		contas.add(createConta("Mariana Rodrigues", 150.0));
		contas.add(createConta("Leandro Ribeiro", 450.0));
		contas.add(createConta("Joselina Maria", 950.0));
		
		
		TemplateRelatorio relatorioSimples = new RelatorioSimplesImpl();
		relatorioSimples.exibeRelatorio(contas);
		
		TemplateRelatorio relatorioComplexo = new RelatorioComplexoImpl();
		relatorioComplexo.exibeRelatorio(contas);
		
	}
	
	
	private static Conta createConta(String titular, Double saldo){
		Conta conta = new Conta();
		conta.setTitular(titular);
		conta.setSaldo(saldo);
		return conta;
	}

}
