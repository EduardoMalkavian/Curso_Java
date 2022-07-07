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
	
	double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return capCombustivel * consumoCombustivel;
		
	}
	
	double calcularCombustivel(double km) {
		
		System.out.println("Quanto de combustível é necessário para o carro andar 10KM?");
		
		double qtdCombustivel = km/consumoCombustivel;
		
		return qtdCombustivel;
		
	}
}
