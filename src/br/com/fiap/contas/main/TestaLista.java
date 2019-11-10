package br.com.fiap.contas.main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import br.com.fiap.contas.modelo.ContaCorrente;

public class TestaLista {

	public static void main(String[] args) {

		ContaCorrente c1 = new ContaCorrente(100.0, "Erica", 123, "USP");
		ContaCorrente c2 = new ContaCorrente(200.0, "Daniela", 456, "Lapa");
		ContaCorrente c3 = new ContaCorrente(300.0, "Ana", 789, "USP");

		List<ContaCorrente> contas = new LinkedList<>();
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);

		Collections.sort(contas);

		for (ContaCorrente contaCorrente : contas) {
			System.out.println(contaCorrente);
		}
		
		System.out.println(contas);
	}
}
