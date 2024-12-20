package Iniciante.Java;

/*


Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos números que não são múltiplos de 13 entre X e Y, incluindo ambos.
Entrada

O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente em ordem crescente.
Saída

Imprima a soma de todos os valores não divisíveis por 13 entre os dois valores lidos na entrada, inclusive ambos se for o caso.

Entradas:
100
200 
Saidas:	
13954
*/

import java.io.IOException;
import java.util.Scanner;

public class multiplos_de_13 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int soma = 0;

        int menor = Math.min(x, y);
        int maior = Math.max(x, y);

        for (int i = menor; i <= maior; i++) {
            if (i % 13 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);
        sc.close();

    }

}
