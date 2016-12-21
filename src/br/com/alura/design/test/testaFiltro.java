package br.com.alura.design.test;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.design.filtro.impl.FiltroSaldoMaior500;
import br.com.alura.design.filtro.impl.FiltroSaldoMenor100;
import br.com.alura.design.model.Conta;

public class testaFiltro {

	public static void main(String[] args) {

		List<Conta> contas = new ArrayList<Conta>();
		contas.add(createConta(50.0, "Juca"));
		contas.add(createConta(770.0, "Pedro"));
		contas.add(createConta(55000000.0, "Juca Jr"));
		contas.add(createConta(55630.0, "Manuel"));
		contas.add(createConta(98210.0, "Andressa"));
		contas.add(createConta(1800.0, "Luis"));
		contas.add(createConta(18.0, "Luis Jr"));
		
		
		List<Conta> contasInvalidas = new FiltroSaldoMenor100(new FiltroSaldoMaior500(null)).filtra(contas);
		
		System.out.println("Contas invalidas: ");
		for(Conta conta : contasInvalidas){			
			System.out.println("Titutla: " + conta.getTitular());
			System.out.println("Saldo: " + conta.getSaldo());
		}
		

	}
	
	private static Conta createConta(Double saldo, String titular){
		Conta conta = new Conta();
		conta.setSaldo(saldo);
		conta.setTitular(titular);
		return conta;
		
	}

}
