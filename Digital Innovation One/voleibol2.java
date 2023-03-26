package Dio;

import java.text.DecimalFormat;
import java.io.IOException;
import java.util.Scanner; 


public class voleibol2 {
 
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in); 
        DecimalFormat df = new DecimalFormat("##00.00");
        
        String nome_jogador = "";
        
        int num_jogadores = 0; 
        int pontuacao_saque = 0; int qntd_acertos_pontuacao_saque = 0; int total_acertos_saque_time = 0; int total_pontuacao_saque_time = 0;
        int pontuacao_bloqueio = 0; int qntd_acertos_pontuacao_bloqueio = 0; int  total_acertos_bloqueio_time = 0; int total_pontuacao_bloqueio_time = 0;
        int pontuacao_ataque = 0; int qntd_acertos_pontuacao_ataque = 0; int total_acertos_ataque_time = 0; int total_pontuacao_ataque_time = 0;

        double calculo1 = 0; double calculo2 = 0; double calculo3 = 0;

        num_jogadores = sc.nextInt();

        for(int i = 1; i <= num_jogadores; i++){
            nome_jogador = sc.next();

            pontuacao_saque = sc.nextInt();
            pontuacao_bloqueio = sc.nextInt();
            pontuacao_ataque = sc.nextInt();

            qntd_acertos_pontuacao_saque = sc.nextInt();
            qntd_acertos_pontuacao_bloqueio = sc.nextInt();
            qntd_acertos_pontuacao_ataque = sc.nextInt();

            total_acertos_saque_time += qntd_acertos_pontuacao_saque;
            total_acertos_bloqueio_time += qntd_acertos_pontuacao_bloqueio;
            total_acertos_ataque_time += qntd_acertos_pontuacao_ataque;

            total_pontuacao_saque_time += pontuacao_saque;
            total_pontuacao_bloqueio_time += pontuacao_bloqueio;
            total_pontuacao_ataque_time += pontuacao_ataque;
        }

        calculo1 = ((total_acertos_saque_time * 100.00) / total_pontuacao_saque_time);
        calculo2 = ((total_acertos_bloqueio_time * 100.00) / total_pontuacao_bloqueio_time);
        calculo3 = ((total_acertos_ataque_time * 100.00) / total_pontuacao_ataque_time);

        System.out.println("Pontos de Saque: " + df.format(calculo1) + " %." + "\nPontos de Bloqueio: " + df.format(calculo2) + " %." + "\nPontos de Ataque: " + df.format(calculo3) + " %.");
    }         
}