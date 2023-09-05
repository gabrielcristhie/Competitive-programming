package Iniciante;

import java.util.Scanner;

public class pares_entre_cinco_numeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vet[] = new int[5];
		int vetP = 0;

		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
			if (vet[i] % 2 == 0) {
				vetP++;
			}
		}
		System.out.println(vetP + " valores pares");

		sc.close();
	}
}
