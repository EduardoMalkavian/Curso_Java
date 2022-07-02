package com.eduardo.cursojava.aula9;

public class Arreys {

	public static void main(String[] args) {
	   double tempDia001 = 31.3;
	   double tempDia002 = 32;
	   double tempDia003 = 37.7;
	   double tempDia004 = 34;
	   double tempDia005 = 33.1;
	   
	   double[] temperatudas = new double[365];
	   temperatudas[0] = 31.3;
	   temperatudas[1] = 32;
	   temperatudas[2] = 37.7;
	   temperatudas[3] = 34;
	   temperatudas[4] = 33.1;
	   
	   System.out.println("A temperatura do dia 1 foi de:" + temperatudas[1]);
	   
	   System.out.println("O tamanho do Arrey é:" + temperatudas.length);
	   
	   
	   
	}

}
