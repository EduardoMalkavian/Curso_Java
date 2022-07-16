package com.eduardo.cursojava.aula16;

public class TesteContador {
	
	static void imprimirValor() {
		System.out.println(Contador.obterValor());
	}

	public static void main(String[] args) {
		
		imprimirValor();
		
		Contador.incremente();
		
		imprimirValor();
		
		Contador.incremente();
		
		imprimirValor();
		
		Contador.zerar();
		
		imprimirValor();
		

	}

}
