package Iniciante;

import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class distancia_entre_dois_pontos {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		int p1;
		int p2;
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		 double distancia = Math.sqrt(Math.pow(x1-x2,2)+ Math.pow(y1-y2,2));
		
		System.out.println(String.format("%.4f", distancia));
	}

}
