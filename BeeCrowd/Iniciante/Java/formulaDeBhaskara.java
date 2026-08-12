package Iniciante.Java;
/* 
Leia 3 valores de ponto flutuante e efetue o c�lculo das ra�zes da equa��o de Bhaskara. Se n�o for poss�vel calcular as ra�zes, mostre a mensagem correspondente �Impossivel calcular�, caso haja uma divis�o por 0 ou raiz de numero negativo.

Entrada
Leia tr�s valores de ponto flutuante (double) A, B e C.

Sa�da
Se n�o houver possibilidade de calcular as ra�zes, apresente a mensagem "Impossivel calcular". Caso contr�rio, imprima o resultado das ra�zes com 5 d�gitos ap�s o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha ap�s cada mensagem.
 */
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class formula_de_bhaskara {
		public static void main(String[] args) throws IOException{
			Scanner sc = new Scanner(System.in);
			double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double delta = (b*b)-4*a*c;
            
            if(delta>=0 && a!=0) {
            	System.out.println(String.format("R1 = %.5f\n", ((b*-1) + Math.sqrt(delta))/(2*a)));
            	System.out.println(String.format("R2 = %.5f\n", ((b*-1) - Math.sqrt(delta))/(2*a)));

            }else {
            	System.out.println("Impossivel calcular\n");
            }
            	
            sc.close();
		}
	}
