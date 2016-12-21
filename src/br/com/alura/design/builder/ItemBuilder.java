package br.com.alura.design.builder;

import br.com.alura.design.model.Item;

public class ItemBuilder {

	private String nome;
	private Double valor;

	public String getNome() {
		return nome;
	}

	public ItemBuilder setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public Double getValor() {
		return valor;
	}

	public ItemBuilder setValor(Double valor) {
		this.valor = valor;
		return this;
	}

	public Item construct(){
		return new Item(nome, valor);
	}

}
