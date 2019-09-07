package br.com.marcos.projetoweb.model;

public class Seguro implements Produto {
	private int numero;
	private double valor;
	private boolean situacao;

	Seguro(int numero, double valor) {
		this.numero = numero;
		this.valor = valor;
		this.situacao = true;
	}

	@Override
	public double valorImposto() {
		return (this.getValor() * 0.03) + 50;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String getTipo() {
		return "seguro";
	}
}