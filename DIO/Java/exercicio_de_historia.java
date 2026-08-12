package Java;

import java.util.Scanner;

public class exercicio_de_historia
{
    // Abaixo segue um exemplo de c�digo que voc� pode ou n�o utilizar
    public static void main(String[] args)
    {
       //a classe Scanner auxilia na leitura dos dados de entrada
       Scanner input = new Scanner(System.in);
       
        int ano, seculo;
    
        // hasNext � um m�todo da classe Java Scanner que retorna true se tiver outra entrada
        while (input.hasNext()) {
        	//TODO: Complete o c�digo com uma solu��o poss�vel
        	 ano = input.nextInt();
        	 if(ano % 100 != 0) {
        		 seculo = (ano / 100) + 1; 
        	 } else {
        		 seculo = ano / 100; 
        	 }
        	
             System.out.println(seculo);        
    }
   input.close(); }
}