package Iniciante;

import java.util.Scanner;

public class par_ou_impar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int valor = 0;
		int i = 1;

		while (i <= n) {
			valor = sc.nextInt();
			if (valor == 0) {
				System.out.println("NULL");
			} else if (valor % 2 == 0 && valor < 0) {
				System.out.println("EVEN NEGATIVE");
			} else if (valor % 2 == 0 && valor > 0) {
				System.out.println("EVEN POSITIVE");
			} else if (valor % 2 != 0 && valor < 0) {
				System.out.println("ODD NEGATIVE");
			} else if (valor % 2 != 0 && valor > 0) {
				System.out.println("ODD POSITIVE");
			}

			i++;
		}
		sc.close();
	}

}
