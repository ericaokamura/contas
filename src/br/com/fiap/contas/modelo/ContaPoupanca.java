package br.com.fiap.contas.modelo;

public class ContaPoupanca extends Conta {

	public String getTipo() {
		return "Conta Corrente";
	}

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(double saldo, String titular, int numero, String agencia) {
		super(saldo, titular, numero, agencia);
	}
	
	

}
