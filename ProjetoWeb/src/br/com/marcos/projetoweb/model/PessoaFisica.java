package br.com.marcos.projetoweb.model;

public class PessoaFisica extends Cliente {
	private String cpf;
	private String nomeMae;
	private String nomePai;
	
	PessoaFisica(String nome, String endereco, String telefone, String cpf) {
		super(nome, endereco, telefone);
		this.setCpf(cpf);
	}
	
	public PessoaFisica(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
