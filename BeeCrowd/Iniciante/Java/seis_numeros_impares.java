package Iniciante.Java;

/*
Beecrowd 1070
Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.
Entrada

A entrada será um valor inteiro positivo.
Saída

A saída será uma sequência de seis números ímpares 
 */
import java.io.IOException;
import java.util.Scanner;

public class seis_numeros_impares {
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);

		int x = leitor.nextInt();
		int i = 0;

		while (i < 6) {
			if (x % 2 == 1) {
				System.out.println(x);
				i++;
			}
			x++;
		}
	}
}