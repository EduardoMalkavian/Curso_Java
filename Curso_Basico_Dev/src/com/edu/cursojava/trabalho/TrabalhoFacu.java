package com.edu.cursojava.trabalho;

import java.util.Scanner;

public class TrabalhoFacu {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // Linha de comando para receber as notas do trimestres.

        // Variáveis
        int faltas1, faltas2, faltas3, totalfaltas;
        double nota1, nota2, nota3, totalnotas;
        // boolean: código de verificação de ação falsa/verdadeira, ser para repetir a
        // mesma pergunta(ação) até a reposta ser verdadeira.
        boolean primeiraNota = false, primeiraFalta = false, segundaNota = false, segundaFalta = false,
                terceiraNota = false, terceiraFalta = false;

        // Nome do aluno //

        System.out.print("Nome do aluno: ");
        String aluno = input.nextLine(); // linha de comando que recebe o nome do aluno.

        // Primeira nota //
        do {

            System.out.print("Informe a primeira nota do aluno: ");

            nota1 = input.nextDouble();

            if (nota1 >= 0 && nota1 <= 10) { // verifica se a nota é um valor correto.
                primeiraNota = true;
                System.out.println();
                System.out.println("Nota lançada com sucesso: " + nota1);
                System.out.println();
            } else { // caso não seja dará erro.
                System.out.println();
                System.out.println("ATENÇÃO: NOTA INVÁLIDA, DIGITE NOVAMENTE !");
                System.out.println();
            }
        } while (!primeiraNota);

        // Primeira falta //
        do {

            System.out.print("Informe as faltas:");

            faltas1 = input.nextInt();

            if (faltas1 >= 0 && faltas1 <= 365) {
                primeiraFalta = true;
                System.out.println();
                System.out.println("Total de faltas:" + faltas1);
                System.out.println();
            } else {
                System.out.println();
                System.out.println("ATENÇÃO: VALOR INVÁLIDA, DIGITE NOVAMENTE !");
                System.out.println();
            }
        } while (!primeiraFalta);

        // Segunda nota
        do {
            System.out.print("Informe a segunda nota do aluno: ");
            nota2 = input.nextDouble();

            if (nota2 >= 0 && nota2 <= 10) {
                segundaNota = true;
                System.out.println();
                System.out.println("Nota lançada com sucesso: " + nota2);
                System.out.println();
            } else {
                System.out.println();
                System.out.println("ATENÇÃO: NOTA INVÁLIDA, DIGITE NOVAMENTE !");
                System.out.println();
            }
        } while (!segundaNota);
        
     // Segunda faltas
        do {

            System.out.print("Informe o as faltas:");

            faltas2 = input.nextInt();

            if (faltas1 >= 0 && faltas1 <= 365) {
                segundaFalta = true;
                System.out.println();
                System.out.println("Total de faltas" + faltas2);
                System.out.println();
            } else {
                System.out.println();
                System.out.println("ATENÇÃO: VALOR INVÁLIDA, DIGITE NOVAMENTE !");
                System.out.println();
            }
        } while (!segundaFalta);

        // terceira nota
        do {

            System.out.print("Informe a terceira nota do aluno: ");

            nota3 = input.nextDouble();

            if (nota3 >= 0 && nota3 <= 10) {
                terceiraNota = true;
                System.out.println();
                System.out.println("Nota lançada com sucesso: " + nota3);
                System.out.println();
            } else {
                System.out.println();
                System.out.println("ATENÇÃO: VALOR INVÁLIDA, DIGITE NOVAMENTE !");
                System.out.println();
            }
        } while (!terceiraNota);

        // Terceira falta
        do {

            System.out.print("Informe o as faltas:");

            faltas3 = input.nextInt();

            if (faltas1 >= 0 && faltas1 <= 365) {
                terceiraFalta = true;
                System.out.println();
                System.out.println("Total de faltas" + faltas3);
                System.out.println();
            } else {
                System.out.println();
                System.out.println("ATENÇÃO: VALOR INVÁLIDA, DIGITE NOVAMENTE !");
                System.out.println();
            }
        } while (!terceiraFalta);

        // calculadora das notas/faltas.
        totalnotas = nota1 + nota2 + nota3; // Vai calcular as notas
        totalfaltas = faltas1 + faltas2 + faltas3; // Vai calcular as faltas.

        // No final do processo mostra a nota, falta e o nome do aluno.

        System.out.println("Nome do aluno: " + aluno);
        System.out.println("Primeira nota: " + nota1);
        System.out.println("Segunda nota: " + nota2);
        System.out.println("Terceira nota: " + nota3);
        System.out.println("Total de notas: " + totalnotas);
        System.out.println("Total de faltas: " + totalfaltas);

        if (totalnotas <= 14) {
            System.out.println("O aluno(a) está REPROVADO!");

        }
        if (totalnotas >= 15 && totalnotas <= 17) {
            System.out.println("O aluno(a) está de RECUPERAÇÃO!");

        }
        if (totalnotas >= 18) {
            System.out.println("O aluno(a) está APROVADO!");
        }
		
	}

}
