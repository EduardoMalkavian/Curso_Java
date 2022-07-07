package com.eduardo.cursojava.aula12;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros; //numero de passageiros
	double capCombustivel; // capacidade de combsutível
	double consumoCombustivel; // consumo de combustível
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "KM");
	}
	
}
