package br.com.marcos.projetoweb.model;

public class PessoaJuridica extends Cliente {
	private String cnpj;
	private String nomeFantasia;
	
	PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String nomeFantasia) {
		super(nome, endereco, telefone);
		this.setCnpj(cnpj);
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
