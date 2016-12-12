package br.com.alura.design.imposto.impl;

import br.com.alura.design.imposto.template.TemplateImpostoCondicional;
import br.com.alura.design.model.Item;
import br.com.alura.design.model.Orcamento;

public class IHIT extends TemplateImpostoCondicional {

	@Override
	public boolean usarMaximaTaxacao(Orcamento orcamento) {

		for (Item item1 : orcamento.getItens()) {
			for (Item item2 : orcamento.getItens()) {
				if (item1 != item2 && item1.getNome().equals(item2.getNome())) {
					return true;
				}

			}// end for1
		}// end for2

		return false;
	}

	@Override
	public Double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100.0;
	}

	@Override
	public Double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (0.01 * orcamento.getItens().size());
	}

}
