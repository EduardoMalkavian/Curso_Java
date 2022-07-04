package com.eduardo.cursojava.aula10;

public class Matrizes {

	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[30] [4];
		   notasAlunos[0][0] = 10;
		   notasAlunos[0][1]= 7;
		   notasAlunos[0][2] = 8;
		   notasAlunos[0][3] = 9.5;
		   
		   notasAlunos[1][0] = 9.1;
		   notasAlunos[1][1] = 8;
		   notasAlunos[1][2] = 7.1;
		   notasAlunos[1][3] = 9.1;
		   
		   notasAlunos[2][0] = 4;
		   notasAlunos[2][1] = 7;
		   notasAlunos[2][2] = 5;
		   notasAlunos[2][3] = 10;
		   
		   System.out.println("A Primeira Nota do Primeiro aluno é:" + notasAlunos[1][1]);
		   
		   System.out.println("O tamanho do Arrey é:" + notasAlunos.length);
		   

	}

}
