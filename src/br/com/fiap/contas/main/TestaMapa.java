package br.com.fiap.contas.main;

import java.util.HashMap;
import java.util.Map;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;

public class TestaMapa {
	
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		c1.deposita( 10000 );
		Conta c2 = new ContaCorrente();
		c2.deposita( 3000 );
		// cria o mapa
		Map<String, Conta> mapaDeContas = new HashMap<>();
		// adiciona duas chaves e seus valores
		mapaDeContas.put( "diretor" , c1);
		mapaDeContas.put( "gerente" , c2);
		// qual a conta do diretor?
		Conta contaDoDiretor = (Conta) mapaDeContas.get( "diretor" );
		System.out.println(contaDoDiretor.getSaldo());
	}

}
