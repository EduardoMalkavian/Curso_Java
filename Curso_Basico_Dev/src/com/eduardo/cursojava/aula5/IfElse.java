package com.eduardo.cursojava.aula5;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a sua idade:");
		
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			
			System.out.println("VOcê é Maior de idade");
		} else {
			System.out.println("VOcê não é Maior de idade");
		} 

		//outro exemplo com preço.
		System.out.println("Qual o valor do produto");
		
		double valor = scan.nextDouble();
		
		if (valor < 10) {
			System.out.println("Compra logo que está de graça!");
		} else if (valor > 10 &&  valor < 15) {
			System.out.println("pede desconto");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Vai Bater perder e procurar mais, ta caro");
		} else {
			System.out.println("Corre que é cilada, bino ");
		}
	}

}
