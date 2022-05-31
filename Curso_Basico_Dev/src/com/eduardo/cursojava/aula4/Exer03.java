package com.eduardo.cursojava.aula4;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Entre com outro número inteiro: ");
		int numero2 = scan.nextInt();
		
		int resultado = numero1+numero2;
		
		System.out.println("A soma dos números que você digitou foi: " + resultado);

	}

}
