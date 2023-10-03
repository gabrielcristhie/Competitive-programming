package Iniciante;

import java.util.Scanner;
import java.io.IOException;

public class Lanche {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int codigoDoProduto = sc.nextInt();
		int quantidadeDeProduto = sc.nextInt();
		double total;

		if (codigoDoProduto == 1) {
			total = quantidadeDeProduto * 4;
			System.out.printf("Total: R$ %.2f", total);

		} else if (codigoDoProduto == 2) {
			total = quantidadeDeProduto * 4.50;
			System.out.printf("Total: R$ %.2f", total);

		} else if (codigoDoProduto == 3) {
			total = quantidadeDeProduto * 5;
			System.out.printf("Total: R$ %.2f", total);

		} else if (codigoDoProduto == 4) {
			total = quantidadeDeProduto * 2;
			System.out.printf("Total: R$ %.2f", total);

		} else if (codigoDoProduto == 5) {
			total = quantidadeDeProduto * 1.50;
			System.out.printf("Total: R$ %.2f", total);

		}
		sc.close();
	}
}