package br.com.alura.design.filtro.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.design.interfaces.Filtro;
import br.com.alura.design.model.Conta;

public class FiltroSaldoMaior500 extends Filtro {

	public FiltroSaldoMaior500(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> contasInvalidas = new ArrayList<Conta>();

		for (Conta conta : contas) {
			if (conta.getSaldo() > 500000.0) {
				contasInvalidas.add(conta);
			}
		}

		List<Conta> contasOInvalidasOutroFiltro = aplicaOutroFiltro(contas);
		if (contasOInvalidasOutroFiltro != null) {
			contasInvalidas.addAll(contasOInvalidasOutroFiltro);
		}

		return contasInvalidas;
	}

}
