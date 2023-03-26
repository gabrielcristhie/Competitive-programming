package Dio;
//Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
//- new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
//- System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;

public class quitandaDoSeuZe {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     int morangos = sc.nextInt();
     int macas = sc.nextInt();
     double kgCompra = morangos + macas;
     double valorPagamento;

//TODO: Implemente as condições necessárias para retornar o preço a ser pago pelo cliente, conforme a tabela de preços do seu Zé:
    if(morangos <= 5 && macas <= 5){
      valorPagamento = (morangos * 2.5) + (macas * 1.8);
      if(kgCompra >= 8 || valorPagamento >= 25){
        valorPagamento = valorPagamento - (valorPagamento * 0.10);
        System.out.println(valorPagamento);
      } else {
    	  System.out.println(valorPagamento);
      }
    } else if(morangos > 5 && macas > 5) {
      valorPagamento = (morangos * 2.2) + (macas * 1.5);
      if(kgCompra >= 8 || valorPagamento >= 25){
          valorPagamento = valorPagamento - (valorPagamento * 0.10);
        System.out.println(valorPagamento);
      } else {
          System.out.println(valorPagamento);
      }
    }
    sc.close();
  }
}