package com.eduardo.cursojava.aula10;

public class Matrizes {

	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[30] [4];
		   notasAlunos[0][0] = 31;
		   notasAlunos[0][1]= 32;
		   notasAlunos[0][2] = 37.7;
		   notasAlunos[0][3] = 34;
		   
		   notasAlunos[1][0] = 33.1;
		   notasAlunos[1][1] = 10;
		   notasAlunos[1][2] = 33.1;
		   notasAlunos[1][3] = 33.1;
		   
		   System.out.println("A Primeira Nota do Primeiro aluno é:" + notasAlunos[1][1]);
		   
		   System.out.println("O tamanho do Arrey é:" + notasAlunos.length);
		   

	}

}
