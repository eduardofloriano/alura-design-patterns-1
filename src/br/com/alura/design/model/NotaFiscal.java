package br.com.alura.design.model;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

	private String razaoSocial;
	private String cnpj;
	private Double valorBruto;
	private Double impostos;
	private Calendar dateDeEmissao;
	private String observacoes;
	private List<Item> itensDaNota;

	
	public NotaFiscal(String razaoSocial, String cnpj, Double valorBruto, Double impostos, Calendar dateDeEmissao,
			String observacoes, List<Item> itensDaNota) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.dateDeEmissao = dateDeEmissao;
		this.observacoes = observacoes;
		this.itensDaNota = itensDaNota;
	}

	public List<Item> getItensDaNota() {
		return itensDaNota;
	}

	public void setItensDaNota(List<Item> itensDaNota) {
		this.itensDaNota = itensDaNota;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Double getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(Double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public Double getImpostos() {
		return impostos;
	}

	public void setImpostos(Double impostos) {
		this.impostos = impostos;
	}

	public Calendar getDateDeEmissao() {
		return dateDeEmissao;
	}

	public void setDateDeEmissao(Calendar dateDeEmissao) {
		this.dateDeEmissao = dateDeEmissao;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

}
