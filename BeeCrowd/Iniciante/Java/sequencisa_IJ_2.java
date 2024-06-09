package Iniciante.Java;

import java.io.IOException;

public class sequencisa_IJ_2 {
  public static void main(String[] args) {
    int I = 1;
    int J = 7;
    while (true) {
      if (J < 5) {
        J = 7;
        I += 2;}
      if (I > 9) {break;}
      System.out.println("I=" + I + " J=" + J);
      J--;
    }
  }
}