package Iniciante;

import java.util.Scanner;

public class pares_impares_positivos_e_negativos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vet[] = new int[5];
		int pares = 0;
		int impares = 0;
		int positivos = 0;
		int negativos = 0;
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
			if (vet[i] % 2 == 0) {
				pares++;
			}if (vet[i] % 2 != 0) {
				impares++;
			}if(vet[i] > 0) {
				positivos++;
			}if (vet[i] < 0) {
				negativos++;
			}
		}
		
		System.out.println(pares + " valor(es) par(es)");
		System.out.println(impares + " valor(es) impar(es)");
		System.out.println(positivos + " valor(es) positivo(s)");
		System.out.println(negativos + " valor(es) negativo(s)");

		sc.close();
	}
}
