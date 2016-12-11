package br.com.alura.design.response.impl;

import br.com.alura.design.enums.FormatoEnum;
import br.com.alura.design.interfaces.Response;
import br.com.alura.design.model.Conta;
import br.com.alura.design.model.Requisicao;

public class ResponsePorcento implements Response  {

	public Response proxima;
	
	public ResponsePorcento(Response proximo) {
		this.proxima = proximo;
	}
	
	@Override
	public void responde(Requisicao requisicao, Conta conta) {
		
		if(requisicao.getFormato().toString().equals(FormatoEnum.PORCENTO.toString())){
			System.out.println(conta.getTitular()+"%"+conta.getSaldo() + "%");
		}else{
			if(proxima == null){
				System.out.println("Fim da corrente!");
			}else{
				proxima.responde(requisicao, conta);
			}
		}
	}

	@Override
	public void proximaResposta(Response resposta) {
		this.proxima = resposta;
		
	}

}
