package br.com.alura.design.filtro.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.design.interfaces.Filtro;
import br.com.alura.design.model.Conta;

public class FiltroSaldoMenor100 extends Filtro{

	public FiltroSaldoMenor100(Filtro outroFiltro){
		super(outroFiltro);
	}
	
	@Override
	public List<Conta> filtra(List<Conta> contas) {

		List<Conta> contasInvalidas = new ArrayList<Conta>();
		
		for(Conta conta : contas){			
			if(conta.getSaldo() < 100.0){
				contasInvalidas.add(conta);
			}			
		}
		
		List<Conta> contasOInvalidasOutroFiltro = aplicaOutroFiltro(contas);		
		if(contasOInvalidasOutroFiltro != null){
			contasInvalidas.addAll(contasOInvalidasOutroFiltro);
		}
		
		return contasInvalidas;
	}

}
