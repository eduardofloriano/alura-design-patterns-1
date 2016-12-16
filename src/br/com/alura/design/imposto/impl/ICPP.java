package br.com.alura.design.imposto.impl;

import br.com.alura.design.model.Orcamento;
import br.com.alura.design.template.TemplateImpostoCondicional;

public class ICPP extends TemplateImpostoCondicional{

	@Override
	public boolean usarMaximaTaxacao(Orcamento orcamento) {
		if(orcamento.getValor() > 500.0){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public Double maximaTaxacao(Orcamento orcamento) {		
		return orcamento.getValor() * 0.07;
	}

	@Override
	public Double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}


}
