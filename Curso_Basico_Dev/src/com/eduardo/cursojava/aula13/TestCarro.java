package com.eduardo.cursojava.aula13;

public class TestCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca= "Fiate";
		van.modelo = "Ducato";
		//van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.numPassageiros);
		
	}

}
