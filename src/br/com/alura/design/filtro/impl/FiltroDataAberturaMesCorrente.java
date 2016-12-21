package br.com.alura.design.filtro.impl;

import java.util.List;

import br.com.alura.design.interfaces.Filtro;
import br.com.alura.design.model.Conta;

public class FiltroDataAberturaMesCorrente extends Filtro {

	public FiltroDataAberturaMesCorrente(Filtro outroFiltro){
		super(outroFiltro);
	}
	
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		
		return null;
	}

}
