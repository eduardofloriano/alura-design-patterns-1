package br.com.alura.design.test;

import br.com.alura.design.builder.ItemBuilder;
import br.com.alura.design.builder.NotaFiscalBuilder;
import br.com.alura.design.model.Item;
import br.com.alura.design.model.NotaFiscal;

public class testaNotaFiscalBuilder {

	
	public static void main(String[] args) {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		ItemBuilder itemBuilder = new ItemBuilder();
		
		NotaFiscal nf = builder.setRazaoSocial("EMPRESA DE TESTE LTA")
		.setCnpj("192.355.123.0001/12")
		.setObservacoes("Observacoes")
		.addItem(itemBuilder.setNome("Item1").setValor(50.0).construct())
		.addItem(itemBuilder.setNome("Item2").setValor(29.9).construct())
		.construct();
		
		System.out.println(nf.getValorBruto());
		
	}
	
}
