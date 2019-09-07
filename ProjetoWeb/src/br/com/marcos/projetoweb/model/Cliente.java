package br.com.marcos.projetoweb.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	private String nome;
	private String endereco;
	private String telefone;
	private List<Produto> produtos;

	Cliente(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.produtos = new ArrayList<Produto>();
	}

	public void addCCorrente(int numero) {
		ContaCorrente cc = new ContaCorrente(numero);
		this.getProdutos().add(cc);
	}

	public void addCPoupanca(int numero) {
		this.getProdutos().add(new ContaPoupanca(numero));
	}

	public void addSeguro(int numero, double valor) {
		this.getProdutos().add(new Seguro(numero, valor));
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
}
