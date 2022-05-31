package com.eduardo.cursojava.aula4;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com a quantidade em Metros: ");
		double metros = scan.nextDouble();
		
		double centimetros = metros*100;
		
		System.out.println("Seu valor equivale a: " + centimetros + "!");
	}

}
