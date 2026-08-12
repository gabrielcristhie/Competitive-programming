package Iniciante.Java;

import java.util.Scanner;

public class sequencia_de_numeros_e_soma {
    private static final int MAX = 10000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        int[] sequencia = new int[MAX];
        int soma = 0;

        do {
            m = sc.nextInt();
            n = sc.nextInt();
            if (m > 0 && n > 0) {
                int min = Math.min(m, n);
                int max = Math.max(m, n);
                for (int i = min; i <= max; i++) {
                    sequencia[i - min] = i;
                    soma += i;
                }
                for (int i = 0; i <= max - min; i++) {
                    System.out.print(sequencia[i] + " ");
                }
                System.out.println("Sum=" + soma);
                soma = 0;
            }
        } while (m > 0 && n > 0);

        sc.close();
    }
}
