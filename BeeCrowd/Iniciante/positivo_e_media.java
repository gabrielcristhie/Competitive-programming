package Iniciante;

import java.util.Scanner;

public class positivo_e_media {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double vet[] = new double[6];
		double vetP[] = new double[6];
		double media = 0;
		double soma = 0;
		int aux = 0;

		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextDouble();
			if (vet[i] >= 0) {
				vetP[i] = vet[i];
				soma += vet[i];
				aux++;
			}
		}
		for (int i = 0; i < vetP.length; i++) {
			media = soma / aux;
		}
		System.out.println(aux + " valores positivos");
		System.out.printf("%.1f", media);

		sc.close();
	}
}
