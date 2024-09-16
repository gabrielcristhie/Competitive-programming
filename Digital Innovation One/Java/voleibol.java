package Java;

import java.io.IOException;
import java.util.Scanner;

public class voleibol {
 
    // Abaixo segue um exemplo de c�digo que voc� pode ou n�o utilizar
    public static void main(String[] args) throws IOException {
 

     Scanner leitor = new Scanner(System.in);

     	String nome = "";
     	
     	int num_jogadores = 0; 
        int pontuacao_saque = 0; int qntd_acertos_pontuacao_saque = 0; int total_acertos_saque_time = 0; int total_pontuacao_saque_time = 0;
        int pontuacao_bloqueio = 0; int qntd_acertos_pontuacao_bloqueio = 0; int  total_acertos_bloqueio_time = 0; int total_pontuacao_bloqueio_time = 0;
        int pontuacao_ataque = 0; int qntd_acertos_pontuacao_ataque = 0; int total_acertos_ataque_time = 0; int total_pontuacao_ataque_time = 0;
		
        //double c1 = 0; double c2 = 0; double c3 = 0;
        
        int N = leitor.nextInt();          

		for (int i =1; i < N; i++) {
			//input para pegar o nome do jogador que n�o vai ser utilizado nos c�lculos
			nome = leitor.next();
			
			pontuacao_saque = leitor.nextInt();
            pontuacao_bloqueio = leitor.nextInt();
            pontuacao_ataque = leitor.nextInt();

            qntd_acertos_pontuacao_saque = leitor.nextInt();
            qntd_acertos_pontuacao_bloqueio = leitor.nextInt();
            qntd_acertos_pontuacao_ataque = leitor.nextInt();

            total_acertos_saque_time += qntd_acertos_pontuacao_saque;
            total_acertos_bloqueio_time += qntd_acertos_pontuacao_bloqueio;
            total_acertos_ataque_time += qntd_acertos_pontuacao_ataque;

            total_pontuacao_saque_time += pontuacao_saque;
            total_pontuacao_bloqueio_time += pontuacao_bloqueio;
            total_pontuacao_ataque_time += pontuacao_ataque;
			
		}
		double bloqueios = (total_acertos_saque_time * 100.00) / total_pontuacao_saque_time;
		double saques = (total_acertos_bloqueio_time * 100.00) / total_pontuacao_bloqueio_time;
		double ataques = (total_acertos_ataque_time * 100.0) / total_pontuacao_ataque_time;
		System.out.println(String.format("Pontos de Saque: %.2f", bloqueios) + " %.");
		System.out.println(String.format("Pontos de Bloqueio: %.2f", saques) + " %.");
		System.out.println(String.format("Pontos de Ataque: %.2f", ataques) + " %.");
 
    }
}