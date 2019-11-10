package br.com.fiap.contas.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.fiap.contas.exception.SaldoInsuficienteException;
import br.com.fiap.contas.modelo.ContaCorrente;
import br.com.fiap.contas.modelo.ContaPoupanca;
import br.com.fiap.contas.modelo.SeguroDeVida;

public class TesteConta {

	public static void main(String[] args) {

		ContaCorrente c2 = new ContaCorrente(100.0, "Erica", 123, "Lapa");
		System.out.println(c2.getTipo());

		ContaPoupanca c3 = new ContaPoupanca(200.0, "Daniela", 456, "Sumaré");
		System.out.println(c3.getTipo());

		SeguroDeVida sdv = new SeguroDeVida();
		System.out.println(sdv.getTipo());

		ContaCorrente c4 = new ContaCorrente();
		try {
			c4.deposita(100.0);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ContaCorrente c5 = new ContaCorrente();
		System.out.println(c5);

		
	}
}
