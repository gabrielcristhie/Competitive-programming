package Iniciante.Java;

import java.util.Scanner;

/*1061 -  Tempo de um Evento

Pedrinho está organizando um evento em sua Universidade. O evento deverá ser no mês de Abril, iniciando e terminando dentro do mês. 
O problema é que Pedrinho quer calcular o tempo que o evento vai durar, uma vez que ele sabe quando inicia e quando termina o evento.
Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá ajudar Pedrinho a calcular a duração deste evento.
Entrada:
Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um espaço e o dia do mês no qual o evento vai começar. 
Na linha seguinte, será informado o momento no qual o evento vai iniciar, no formato hh : mm : ss. 
Na terceira e quarta linha de entrada haverá outra informação no mesmo formato das duas primeiras linhas, indicando o término do evento.
Saída:
Na saída, deve ser apresentada a duração do evento, no seguinte formato:
W dia(s)
X hora(s)
Y minuto(s)
Z segundo(s)
Obs: Considere que o evento do caso de teste para o problema tem duração mínima de 1 minuto.
Exemplo de Entrada
Dia 5
08 : 12 : 23
Dia 9
06 : 13 : 23
Exemplo de Saída
3 dia(s)
22 hora(s)
1 minuto(s)
0 segundo(s)

*/
public class tempo_de_um_evento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.next("Dia");  
        int diaInicio = sc.nextInt();
        int horaInicio = sc.nextInt();
        sc.next(":");
        int minutoInicio = sc.nextInt();
        sc.next(":");
        int segundoInicio = sc.nextInt();

        sc.next("Dia");
        int diaTermino = sc.nextInt();
        int horaFinal = sc.nextInt();
        sc.next(":");
        int minutoFinal = sc.nextInt();
        sc.next(":");
        int segundoFinal = sc.nextInt();


        int totalSegundosInicio = ((diaInicio) * 86400) + (horaInicio * 3600) + (minutoInicio * 60) + segundoInicio;
        int totalSegundosFinal = ((diaTermino) * 86400) + (horaFinal * 3600) + (minutoFinal * 60) + segundoFinal;   
        int duracaoTotalSegundos = totalSegundosFinal - totalSegundosInicio;

        System.out.println((duracaoTotalSegundos / 86400) + " dia(s)");
        System.out.println((duracaoTotalSegundos % 86400) / 3600 + " hora(s)");
        System.out.println(((duracaoTotalSegundos % 86400) % 3600) / 60 + " minuto(s)");
        System.out.println((((duracaoTotalSegundos % 86400) % 3600) % 60) + " segundo(s)");
    }
}
