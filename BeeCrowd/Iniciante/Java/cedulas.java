package Iniciante.Java;
/*
Leia um valor inteiro. A seguir, calcule o menor n�mero de notas poss�veis (c�dulas) no qual o valor pode ser decomposto. As notas consideradas s�o de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a rela��o de notas necess�rias.

Entrada
O arquivo de entrada cont�m um valor inteiro N (0 < N < 1000000).

Sa�da
Imprima o valor lido e, em seguida, a quantidade m�nima de notas de cada tipo necess�rias, conforme o exemplo fornecido. N�o esque�a de imprimir o fim de linha ap�s cada linha, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
 */
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class cedulas {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		int cedulas = sc.nextInt();
		int nota100;
		int resto100;
		int nota50;
		int resto50;
		int nota20;
		int resto20;
		int nota10;
		int resto10;
		int nota5;
		int resto5;
		int nota2;
		int resto2;
		int nota1;
		
		nota100 = cedulas/100;
		resto100 = cedulas %100;
		nota50 = resto100/50;
		resto50 = resto100 % 50;
		nota20 = resto50 / 20;
		resto20 = resto50 % 20;
		nota10 = resto20 / 10;
		resto10 = resto20 % 10;
		nota5 = resto10 / 5;
		resto5 = resto10 % 5;
		nota2 = resto5 / 2;
		resto2 = resto5 % 2;
		nota1 = resto2;
		
		System.out.println(cedulas);
		System.out.println(nota100 + " nota(s) de R$ 100,00");
		System.out.println(nota50 + " nota(s) de R$ 50,00");
		System.out.println(nota20 + " nota(s) de R$ 20,00");
		System.out.println(nota10 + " nota(s) de R$ 10,00");
		System.out.println(nota5 + " nota(s) de R$ 5,00");
		System.out.println(nota2 + " nota(s) de R$ 2,00");
		System.out.println(nota1 + " nota(s) de R$ 1,00");

		sc.close();
	}
}
