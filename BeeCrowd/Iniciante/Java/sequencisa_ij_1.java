package Iniciante.Java;

import java.io.IOException;

public class sequencisa_ij_1 {
    public static void main(String[] args) throws IOException {
    int I = 1;
    int J = 60;

    for(int i = 0; J >= 0; i++){
        System.out.println("I=" + I + " J=" + J);
        I += 3;
        J -= 5;
    }       
  }
}