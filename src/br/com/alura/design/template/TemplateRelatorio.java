package br.com.alura.design.template;

import java.util.List;

import br.com.alura.design.model.Conta;

public abstract class TemplateRelatorio {
	
	public abstract void cabecalho();
	public abstract void rodape();
	public abstract void corpo(List<Conta> contas);

	public void exibeRelatorio(List<Conta> contas){
		cabecalho();
		corpo(contas);
		rodape();
	}
	
	
}
