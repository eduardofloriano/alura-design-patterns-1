package br.com.alura.design.interfaces;

import br.com.alura.design.model.Orcamento;

public interface EstadoOrcamento {

	public Double getValor(Orcamento orcamento);
	public void aprova(Orcamento orcamento);
	public void reprova(Orcamento orcamento);
	public void finaliza(Orcamento orcamento);
}
