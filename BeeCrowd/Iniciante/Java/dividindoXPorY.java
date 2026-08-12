package Iniciante.Java;

import java.util.Scanner;

public class dividindo_x_por_y {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            double x = sc.nextInt();
            double y = sc.nextInt();

            // if (x == 0) {
            //     // System.out.println("divisao impossível");
            // }
            if (y == 0) {
                System.out.println("divisao impossível");
            } else {

                double divisao = x / y;
                System.out.println(divisao);
            }
        }
    }
}
