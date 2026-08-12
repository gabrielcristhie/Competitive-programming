package Java;

import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int y = reader.nextInt();
        
        while (x != 0 || y != 0){
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }
            x = reader.nextInt();
            y = reader.nextInt();
        }
        
        reader.close();
    }
}