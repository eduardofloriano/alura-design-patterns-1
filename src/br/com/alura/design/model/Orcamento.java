package br.com.alura.design.model;

import java.util.List;

import br.com.alura.design.impl.EstadoEmAprovacao;
import br.com.alura.design.interfaces.EstadoOrcamento;

public class Orcamento {
	
	public Double valor;	
	private List<Item> itens;

	private EstadoOrcamento estadoAtual = new EstadoEmAprovacao();
	
	
	public EstadoOrcamento getEstadoAtual() {
		return estadoAtual;
	}

	public void setEstadoAtual(EstadoOrcamento estadoAtual) {
		this.estadoAtual = estadoAtual;
	}

	public Orcamento(){
	}
	
	public Orcamento(double valor){
		this.valor= valor;
	}
	public Double getValor() {		
		return estadoAtual.getValor(this);
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	public void aprova() {
		estadoAtual.aprova(this);	
	}
	
	public void reprova() {
		estadoAtual.reprova(this);		
	}
	
	public void finaliza() {
		estadoAtual.finaliza(this);		
	}
	
}
