package Java;

import java.util.Scanner;

public class imprimindo_positivos_e_media {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        double[] numeros = new double[6]; 

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextDouble();
        }

        int quantidadePositivos = 0;
        double somaPositivos = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                quantidadePositivos++;
                somaPositivos += numeros[i];
            }
        }

        String mediaPositivos = String.format("%.1f", somaPositivos / quantidadePositivos);

        System.out.println(quantidadePositivos + " valores positivos");
        System.out.println(mediaPositivos);
        
        sc.close();
    }
}