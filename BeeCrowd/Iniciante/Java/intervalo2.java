package Iniciante.Java;

/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.
Entrada

A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de teste.
Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
 
Saída

Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) do intervalo.

Exemplo de entrada:
4
14
123
10
-25
12
Exemplo de saida:
2 in
2 out
 * */

import java.io.IOException;
import java.util.Scanner;

public class intervalo_2 {

	private static final int MAX = 10000;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int in = 0;
		int out = 0;
		int[] v = new int[n];

		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
			if (v[i] >= 10 && v[i] <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();
	}
}
