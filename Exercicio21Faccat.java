/*21) LER A HORA DE INÍCIO E A HORA DE FIM DE UM JOGO --DE XADREZ
(CONSIDERE APENAS HORAS INTEIRAS, SEM OS MINUTOS)E CALCULE A DURAÇÃO DO JOGO
 EM HORAS,SABENDO-SE QUE O TEMPO MÁXIMO DE DURAÇÃO DO JOGO É DE 24 HORASE QUE
 O JOGO PODE INICIAR EM UM DIA E TERMINAR NO DIA SEGUINTE.*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio21Faccat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int inicio = 24;
		int fim = 24;
		
		while((inicio < 0) || (inicio > 23))
		{
			System.out.println("Horário do início do jogo? ");
			inicio = sc.nextInt();		
		}
		while((fim < 0) || (fim > 23))
		{
			System.out.println("Horário do fim do jogo? ");
			 fim = sc.nextInt();
		}
		
		int tempoTotal = fim - inicio;
			  
		if (tempoTotal < 0) 
		{	
			tempoTotal += 24;
			System.out.println("A quantidade de horas jogadas coresponde a :"+tempoTotal + " hrs.");
		}
		else if (tempoTotal == 0) 
		{	
			System.out.println("A partida chegou a 24 hrs");
		}
		else
		{
		System.out.println("O tempo de jogo é : " + tempoTotal + " hrs.");
		}
		
		sc.close();

	}

}
