package br.com.fiap.contas.modelo;

import br.com.fiap.contas.exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel {

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar um valor negativo");
		} else {
			this.saldo += valor;
		}
	}

	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException();
		} 
		if ( this .saldo < valor) {
			throw new SaldoInsuficienteException(valor);
		}
		else {
			this.saldo -= (valor + 0.1);
		}
	}

	public String getTipo() {
		return "Conta Corrente";
	}

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(double saldo, String titular, int numero, String agencia) {
		super(saldo, titular, numero, agencia);
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}

}
