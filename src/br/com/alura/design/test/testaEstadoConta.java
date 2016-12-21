package br.com.alura.design.test;

import br.com.alura.design.model.Conta;

public class testaEstadoConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setTitular("Luis Eduardo");
		conta.setSaldo(100.0);
		
		System.out.println("Conta criada - Titular: " + conta.getTitular() + " | Saldo Inicial: " + conta.getSaldo());
		System.out.println("Estado da Conta: " + conta.getEstadoAtual().getClass().getSimpleName());
		
		conta.saque(200.0);
		System.out.println("Movimentacao concluida: Saldo Final - " + conta.getSaldo());
		System.out.println("Estado da Conta: " + conta.getEstadoAtual().getClass().getSimpleName());
		
		conta.saque(10.0);
		System.out.println("Movimentacao concluida: Saldo Final - " + conta.getSaldo());
		System.out.println("Estado da Conta: " + conta.getEstadoAtual().getClass().getSimpleName());
	}

}
