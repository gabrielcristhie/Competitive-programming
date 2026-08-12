package Iniciante.Java;

/*
Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste de dois inteiros X e Y. Você deve apresentar a soma de todos os ímpares existentes entre X e Y.

Entrada
A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

Saída
Imprima a soma de todos valores ímpares entre X e Y.
 * */

import java.io.IOException;
import java.util.Scanner;

import java.util.Scanner;

class soma_de_impares_consecutivos_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0;
		int y = 0;

		while (n > 0) {
			x = sc.nextInt();
			y = sc.nextInt();
			int soma = 0;
			int menor = Math.min(x, y) + 1;
			int maior = Math.max(x, y);

			for (int i = menor; i < maior; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
			
			System.out.println(soma);
			n--;
		}
	}
}
