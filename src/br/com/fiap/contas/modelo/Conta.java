package br.com.fiap.contas.modelo;

import br.com.fiap.contas.exception.SaldoInsuficienteException;

public abstract class Conta implements Comparable<Conta> {

	protected double saldo;

	private String titular;

	private int numero;

	private String agencia;

	public Conta() {

	}

	public Conta(double saldo, String titular, int numero, String agencia) {
		this.saldo = saldo;
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException();
		}
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(valor);
		} else {
			this.saldo -= (valor);
		}
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar um valor negativo");
		} else {
			this.saldo += valor;
		}
	}

	public abstract String getTipo();

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	@Override
	public String toString() {
		return "[titular=" + titular + ", numero=" + numero + ", agencia=" + agencia + "]";
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		Conta outraConta = (Conta) obj;
		return this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia);

	}

	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}
}
