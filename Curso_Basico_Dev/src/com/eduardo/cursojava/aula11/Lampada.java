package com.eduardo.cursojava.aula11;

public class Lampada {
	
	String modelo;
	String Tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String [] tipos;
	boolean ligada;	
	boolean desligada;
	
	void ligar() {
		ligada = true;
	}
	
	void desligar() {
		ligada = false;
	}
		
	
}
