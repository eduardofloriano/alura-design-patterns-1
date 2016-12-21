package br.com.alura.design.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.alura.design.model.Item;
import br.com.alura.design.model.NotaFiscal;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private Calendar dataDeEmisssao = Calendar.getInstance();
	private String observacoes;

	private List<Item> itens = new ArrayList<Item>();
	private double valorTotal;
	private double impostoTotal;

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public NotaFiscalBuilder setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public String getCnpj() {
		return cnpj;
	}

	public NotaFiscalBuilder setCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public NotaFiscalBuilder setObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}

	public NotaFiscalBuilder addItem(Item item) {		
		valorTotal += item.getValor();
		impostoTotal += item.getValor() * 0.05;
		itens.add(item);
		return this;

	}

	public NotaFiscal construct() {

		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, valorTotal, impostoTotal, dataDeEmisssao, observacoes, itens);
		return nf;

	}

}
