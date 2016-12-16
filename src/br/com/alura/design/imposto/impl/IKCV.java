package br.com.alura.design.imposto.impl;

import br.com.alura.design.model.Item;
import br.com.alura.design.model.Orcamento;
import br.com.alura.design.template.TemplateImpostoCondicional;

public class IKCV extends TemplateImpostoCondicional {

	@Override
	public boolean usarMaximaTaxacao(Orcamento orcamento) {
		if (orcamento.getValor() > 500.0) {

			for (Item item : orcamento.getItens()) {
				if (item.getValor() > 100.00) {
					return true;
				}
			}
		}
		
		return false;
	}

	@Override
	public Double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	public Double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
