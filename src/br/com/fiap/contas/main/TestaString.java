package br.com.fiap.contas.main;

public class TestaString {
	public static void main(String[] args) {
		String s = "fj11";
		s.replaceAll("1", "2");
		System.out.println(s);
		s = s.replaceAll("1", "2");
		System.out.println(s);
	}
}	