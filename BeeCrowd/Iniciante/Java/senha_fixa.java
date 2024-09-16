package Iniciante.Java;

import java.util.Scanner;

public class senha_fixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senhaCorreta = 2002;
        int n = 0;

        do {
            n = sc.nextInt();
            if (n != senhaCorreta) {
                System.out.println("Senha Invalida");

            } else {
                System.out.println("Acesso Permitido");
            }
        } while (n != senhaCorreta);
        sc.close();
    }
}
