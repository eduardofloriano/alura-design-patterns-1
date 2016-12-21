package br.com.alura.design.model;

import br.com.alura.design.impl.EstadoContaNegativo;
import br.com.alura.design.impl.EstadoContaPositivo;
import br.com.alura.design.interfaces.EstadoConta;

public class Conta {

	private String titular;
	private Double saldo;
	
	private EstadoConta estadoAtual = new EstadoContaPositivo(); 
	

	public EstadoConta getEstadoAtual() {
		return estadoAtual;
	}

	public void setEstadoAtual(EstadoConta estadoAtual) {
		this.estadoAtual = estadoAtual;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	
	public void saque(Double valor){
		
		if(estadoAtual.getClass() == EstadoContaPositivo.class){
			this.saldo -= valor;			
			if(this.saldo < 0){
				this.estadoAtual = new EstadoContaNegativo();
			}			
		}else{
			throw new RuntimeException("Contas negativadas não podem realizar saques!");
		}
		
	}
	
	public void deposita(Double valor){
		this.saldo += valor;
		if(this.saldo >= 0 && estadoAtual.getClass() == EstadoContaNegativo.class){
			this.estadoAtual = new EstadoContaPositivo();
		}
	}
	
	public void positivaConta(){
		estadoAtual.positivaConta(this);		
	}
	public void negativaConta(){
		estadoAtual.negativaConta(this);		
	}
	
}
