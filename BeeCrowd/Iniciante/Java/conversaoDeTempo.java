package Iniciante.Java;
/*
Leia um valor inteiro, que � o tempo de dura��o em segundos de um determinado evento em uma f�brica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada cont�m um valor inteiro N.

Sa�da
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido. 
 */
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class conversao_de_tempo {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	int horas;
	int rh;
	int minutos;
	int rm;
	int segundos;
	
	horas = n/3600;
	rh = n % 3600;
	minutos = rh/60;
	rm = rh % 60;
	segundos = rm;
	
	System.out.println(horas + ":" + minutos + ":" + segundos);
	
	sc.close();

	}

}
