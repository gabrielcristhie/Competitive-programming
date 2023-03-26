package Iniciante;
/* 
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.
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
