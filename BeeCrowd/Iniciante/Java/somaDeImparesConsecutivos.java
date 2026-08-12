package Iniciante.Java;

/*
Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.
Entrada

O arquivo de entrada contém dois valores inteiros.
Saída

O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares que estão entre os valores fornecidos na entrada que deverá caber em um inteiro.

Exemplo de entrada:
6
-5
-----
15
12
-----
12
12
Exemplo de saida:

5
-----
13
-----
0 
 * */

import java.io.IOException;
import java.util.Scanner;

public class soma_de_impares_consecutivos {
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int soma = 0;
		
        for (int i = Math.min(x, y) + 1; i < Math.max(x, y); i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
		
		System.out.println(soma);
		sc.close();
	}
}

