package br.com.alura.design.interfaces;

import java.util.List;

import br.com.alura.design.model.Conta;

/**
 * DECORATOR
 * @author Eduardo
 *
 */
public abstract class Filtro {

	Filtro outroFiltro;
	
	public Filtro(){
		
	}
	
	public Filtro(Filtro outroFiltro){
		this.outroFiltro = outroFiltro;
	}
	
	protected List<Conta> aplicaOutroFiltro(List<Conta> contas){		
		if(outroFiltro != null){
			return outroFiltro.filtra(contas);
		}else{
			return null;
		}		
	}
	
	public abstract List<Conta> filtra(List<Conta> contas);
	
	
}
