package Iniciante.Java;

import java.util.Scanner;

public class resto_da_divisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int menor = Math.min(x, y);
        int maior = Math.max(x, y);

        for (int i = menor + 1; i < maior; i++) {

            if (i % 5 == 2) {
                System.out.println(i);
            }
            if (i % 5 == 3) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
