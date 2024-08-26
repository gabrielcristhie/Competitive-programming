/*

*/

package Iniciante.Java;

import java.util.Scanner;

public class maior_e_posicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[100];
        int maior = vet[0];
        int posicao = 0;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
            if (vet[i] > maior) {
                maior = vet[i];
                posicao = i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
        sc.close();

    }
}
