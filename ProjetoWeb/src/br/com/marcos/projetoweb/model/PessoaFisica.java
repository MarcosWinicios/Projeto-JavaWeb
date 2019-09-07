package br.com.marcos.projetoweb.model;

public class PessoaFisica extends Cliente {
	private String cpf;
	private String nomeMae;
	private String nomePai;
	
	PessoaFisica(String nome, String endereco, String telefone, String cpf) {
		super(nome, endereco, telefone);
		this.cpf = cpf;
	}
	
	
}
