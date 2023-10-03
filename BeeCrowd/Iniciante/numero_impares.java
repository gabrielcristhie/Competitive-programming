package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class numero_impares {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int MAX = 1000;
		int x = sc.nextInt();
		int[] impares = new int[MAX];

		for(int i = 0; i <= x; i++){
			if(i % 2 != 0) {
			impares[i] += i;
			System.out.println(impares[i]);
		  }
		}
	}
}