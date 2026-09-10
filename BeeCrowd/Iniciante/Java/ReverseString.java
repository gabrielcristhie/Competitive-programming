package Iniciante.Java;

import java.util.Scanner;

public class ReverseString {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String texto = sc.nextLine();
        String stringReversa = "";

        for (int i = texto.length() -1 ; i >=0; i--){
            char caractere = texto.charAt(i);
            stringReversa = stringReversa + caractere;
        }

        System.out.println(stringReversa);
    }
    
}