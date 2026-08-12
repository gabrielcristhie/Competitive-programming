package Iniciante.Java;

/*
Leia 3 valores, no caso, vari�veis A, B e C, que s�o as tr�s notas de um aluno. A seguir, calcule a m�dia do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 at� 10.0, sempre com uma casa decimal.
Entrada
O arquivo de entrada cont�m 3 valores com uma casa decimal, de dupla precis�o (double).
Sa�da
Imprima a mensagem "MEDIA" e a m�dia do aluno conforme exemplo abaixo, com 1 d�gito ap�s o ponto decimal e com um espa�o em branco antes e depois da igualdade. Assim como todos os problemas, n�o esque�a de imprimir o fim de linha ap�s o resultado, caso contr�rio, voc� receber� "Presentation Error".
Ex:
Entrada
5.0
6.0
7.0
Saida
MEDIA = 6.3
*/

import java.io.IOException;
import java.util.Scanner;

public class media_2 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double nota = ((a * 2) + (b * 3) + (c * 5)) / 10;

		System.out.println(String.format("MEDIA = %.1f", nota));

		sc.close();
	}
}