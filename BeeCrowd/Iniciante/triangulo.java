package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class triangulo {
	public static void main(String[] args)  throws IOException {

	Scanner sc = new Scanner(System.in);
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	double c = sc.nextDouble();
	
	if(a < b + c && b < a + c && c < a + b){
		System.out.println("Perimetro = " + String.format("%.1f", a+b+c));
	} else {
		System.out.println("Area = " + String.format("%.1f", a+b*c/2.0));
	}
	
//	System.out.println(a + b + c);
	
	sc.close();
}
}