package Iniciante;

/*
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido. 
 */
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class idade_em_dias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int anos = n / 365;
		int ra = n % 365;
		int meses = ra / 30;
		int dias = ra % 30;
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		sc.close();

	}
}