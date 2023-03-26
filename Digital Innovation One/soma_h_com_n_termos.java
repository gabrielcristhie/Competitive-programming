package Dio;

import java.util.Scanner;

public class soma_h_com_n_termos {

    public static void main(String[] Args) {

     double h = 0;
     Scanner sc = new Scanner(System.in);
     double n = sc.nextDouble();

     for (int i = 1; i <= n; i++) {
    	h = h + (double)1/i ;
      }
     //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
      String resultado = String.format("%.2f", h);
      
      System.out.println(resultado);
      sc.close();
   }
}