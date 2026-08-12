package Iniciante.Java;

import java.io.IOException;
import java.util.Scanner;

public class crescente_e_decrescente {
    public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		int x, y;
        do {
            x = sc.nextInt();
            y = sc.nextInt();
            if (x != y) {
                if (x > y) {
                    System.out.println("Decrescente");
                } else {
                    System.out.println("Crescente");
                }
            }
        } while(x != y);
    }
}
