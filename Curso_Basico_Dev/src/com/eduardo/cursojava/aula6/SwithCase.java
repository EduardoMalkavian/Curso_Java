package com.eduardo.cursojava.aula6;

import java.util.Scanner;

public class SwithCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um dia da semana (1-7):");
		
		int diaSemana = scan.nextInt();
		
		if (diaSemana ==1) {
			System.out.println("Domingo");
		} else if (diaSemana == 2) {
			System.out.println("Segunda");
	    } else if (diaSemana == 3) {
			System.out.println("terça");
	    } else if (diaSemana == 4) {
			System.out.println("quarta");
	    } else if (diaSemana == 5) {
			System.out.println("quinta");
	    } else if (diaSemana == 6) {
			System.out.println("sexta");
	    } else if (diaSemana == 7) {
			System.out.println("sabado");
	    } else {
	    	System.out.println("Não é um dia da semana valido");
	    }

		switch(diaSemana) {
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda"); break;
		case 3: System.out.println("terça"); break;
		case 4: System.out.println("Quarta"); break;
		case 5: System.out.println("Quinta"); break;
		case 6: System.out.println("Sexta"); break;
		case 7: System.out.println("Sabado"); break;
		default: System.out.println("Não é um dia da semana valido");
		}
	}
}