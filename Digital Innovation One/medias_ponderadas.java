package Dio;

//Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class medias_ponderadas {
 public static void main(String[] args)
 {
    Scanner input = new Scanner(System.in);
    
     int casos = input.nextInt();
     int cont = 0;
     
     while (cont < casos){

         double a = input.nextDouble();
         double b = input.nextDouble();
         double c = input.nextDouble();
	
	   // TODO: complete os espaços em branco com sua solução para o problema
         double media = ((a * 2) + (b * 3) + (c * 5))/10;
         System.out.println(String.format("%.1f", media));
         cont++;
         }
 }
 }