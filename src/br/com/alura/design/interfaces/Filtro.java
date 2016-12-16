package br.com.alura.design.interfaces;

import java.util.List;

import br.com.alura.design.model.Conta;

public abstract class Filtro {

	public abstract boolean filtra(List<Conta> contas);
	
	
}
