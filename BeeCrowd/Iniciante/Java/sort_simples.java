package Iniciante.Java;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class sort_simples {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int[] v = new int[3];
		
		for (int i = 0; i < 3; i++) {
			v[i] = sc.nextInt();
		}
		
		int[] segundo = v.clone();
		Arrays.sort(segundo);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(segundo[i]);
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < 3; i++) {
			System.out.println(v[i]);
		}
	}
}
