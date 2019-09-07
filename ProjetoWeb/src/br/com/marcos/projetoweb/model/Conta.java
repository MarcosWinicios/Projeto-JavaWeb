package br.com.marcos.projetoweb.model;

public abstract class Conta implements Produto {
	private int numero;
	private double saldo;
	private boolean situacao;

	Conta(int numero) {
		this.numero = numero;
		this.saldo = 0;
		this.situacao = true;
	}

	public boolean sacar(double valor) {
		if (valor <= this.getSaldo()) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		} else {
			return false;
		}
	}

	public void desativar() {
		this.situacao = false;
	}

	public void ativar() {
		this.situacao = true;
	}

	public boolean estaAtivada() {
		return this.situacao;
	}

	public double getSaldo() {
		return saldo;
	}
}