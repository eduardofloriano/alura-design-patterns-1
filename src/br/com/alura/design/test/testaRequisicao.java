package br.com.alura.design.test;

import br.com.alura.design.enums.FormatoEnum;
import br.com.alura.design.interfaces.Response;
import br.com.alura.design.model.Conta;
import br.com.alura.design.model.Requisicao;
import br.com.alura.design.response.impl.ResponseCsv;
import br.com.alura.design.response.impl.ResponsePorcento;
import br.com.alura.design.response.impl.ResponseXml;

public class testaRequisicao {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setTitular("Luis Eduardo");
		conta.setSaldo(500.0);
		
		
		Requisicao req = new Requisicao();
		req.setFormato(FormatoEnum.CSV);
		
		
		//chain
		
		Response r3 = new ResponseCsv(null);
		Response r2 = new ResponsePorcento(r3);
		Response r1 = new ResponseXml(r2); 
		
		
		r1.responde(req, conta);
		
	}

}
