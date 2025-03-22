package Iniciante.Java;

import java.util.Scanner;

public class Tomadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tomadas = new int[4];
        for (int i = 0; i < 4; i++) {
            tomadas[i] = sc.nextInt();
        }
        int t1 = tomadas[0], t2 = tomadas[1], t3 = tomadas[2], t4 = tomadas[3];
        int soma = 0;

        soma = ((t1 - 1) + (t2 - 1) + (t3 - 1)) + t4;

        System.out.println(soma);

        sc.close();
    }
}
