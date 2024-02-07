package Iniciante.Java;
/* 
Fa�a um programa que leia tr�s valores e apresente o maior dos tr�s valores lidos seguido da mensagem �eh o maior�. Utilize a f�rmula:
MaiorAB=(a+b+abs(a-b))/2
Obs.: a f�rmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto � necess�rio para chegar no resultado esperado.

Entrada
O arquivo de entrada cont�m tr�s valores inteiros.

Sa�da
Imprima o maior dos tr�s valores seguido por um espa�o e a mensagem "eh o maior".
 */
import java.io.IOException;
import java.util.Scanner;



public class o_maior {
		public static void main(String[] args) throws IOException{
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a > b && a > c) {
				System.out.println(a + " eh o maior");
			} else if (b > c){
				System.out.println(b + " eh o maior");
			}else {
				System.out.println(c + " eh o maior");
			}			

			sc.close();
		}
	}
