package Iniciante.Java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class validacao_de_nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, media;

        do {
            num1 = sc.nextDouble();
            if (num1 < 0 || num1 > 10) {
                System.out.println("nota invalida");
            }
        } while (num1 < 0 || num1 > 10);

        do {
            num2 = sc.nextDouble();
            if (num2 < 0 || num2 > 10) {
                System.out.println("nota invalida");
            }
        } while (num2 < 0 || num2 > 10);

        media = (num1 + num2) / 2;
        System.out.printf("media = %.2f\n", media);

        sc.close();
    }
}


