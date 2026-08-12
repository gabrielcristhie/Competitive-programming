package Iniciante.Java;

import java.util.Scanner;

public class calculo_simples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod1 = sc.nextInt(); 
		int num1 = sc.nextInt(); 
		double val1 = sc.nextDouble();
		int cod2 = sc.nextInt(); 
		int num2 = sc.nextInt(); 
		double val2 = sc.nextDouble();
		double valor = (val1 * num1)+(val2 * num2);
		
		System.out.println(String.format("VALOR A PAGAR: R$ %.2f", valor));

	}

}
