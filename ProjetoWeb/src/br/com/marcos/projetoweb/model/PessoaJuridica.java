package br.com.marcos.projetoweb.model;

public class PessoaJuridica extends Cliente {
	private String cnpj;
	private String nomeFantasia;
	
	PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String nomeFantasia) {
		super(nome, endereco, telefone);
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
	}
}
