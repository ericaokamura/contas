package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;

public class TestaArrays {

	public static void main(String[] args) {

		Conta[] contas = new Conta[10];
		for (int i = 0; i < contas.length; i++) {
			Conta conta = new ContaCorrente();
			conta.deposita(i * 100.0);
			contas[i] = conta;
		}
		
		double soma = 0.0;
		
		double media = 0.0;
		
		for (int j = 0; j < contas.length; j++) {
			soma += contas[j].getSaldo();
		}
		
		media = soma / contas.length;
		
		System.out.println(media);
	}

}
