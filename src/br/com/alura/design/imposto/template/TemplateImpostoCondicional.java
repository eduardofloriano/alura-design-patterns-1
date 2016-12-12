package br.com.alura.design.imposto.template;

import br.com.alura.design.interfaces.Imposto;
import br.com.alura.design.model.Orcamento;

public abstract class TemplateImpostoCondicional implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {

		if (usarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		} else {
			return minimaTaxacao(orcamento);
		}

	}

	public abstract boolean usarMaximaTaxacao(Orcamento orcamento);

	public abstract Double maximaTaxacao(Orcamento orcamento);

	public abstract Double minimaTaxacao(Orcamento orcamento);

}
