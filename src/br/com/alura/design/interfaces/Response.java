package br.com.alura.design.interfaces;

import br.com.alura.design.model.Conta;
import br.com.alura.design.model.Requisicao;

public interface Response {
	
	public void responde(Requisicao requisicao, Conta conta);
	public void proximaResposta(Response resposta);
	
}
