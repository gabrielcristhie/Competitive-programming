package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class consumo {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		int distancia = sc.nextInt();
		double combustivel = sc.nextDouble();
		double total = distancia / combustivel;
		
		System.out.println(String.format("%.3f km/l", total));

	}

}
