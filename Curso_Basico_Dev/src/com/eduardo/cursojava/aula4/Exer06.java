package com.eduardo.cursojava.aula4;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com  o raio: ");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow (raio, 2);
		
		System.out.println("A área do crículo é: " + area);

	}

}
