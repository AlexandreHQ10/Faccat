/*8) ESCREVA  UM  ALGORITMO  PARA  LER  O  NÚMERO  TOTAL  DE  ELEITORES 
 *  DE UMMUNICÍPIO,  O  NÚMERO  DE  VOTOS BRANCOS, NULOS E VÁLIDOS.
 *  CALCULAR E ESCREVER O PERCENTUAL QUE CADA UM REPRESENTA EM RELAÇÃO AO
 *   TOTAL DE ELEITORES. */

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio08Faccat 
{

	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nDigite a quantidade total de eleitores de um municipio : ");
		int eleitores = sc.nextInt();
		System.out.println("\nDigite a quantidade total de eleitores que votaram em branco : ");
		int votosBrancos = sc.nextInt();
		System.out.println("\nDigite a quantidade total de eleitores que votaram em nulo : ");
		int votosNulos = sc.nextInt();
		System.out.println("\nDigite a quantidade total de eleitores que tiveram votos válidos : ");
		int votosValidos = sc.nextInt();
		
		double percentualVotosBrancos = votosBrancos*100/eleitores;
		double percentualNulos = votosNulos*100/eleitores;
		double percentualVotosValidos = votosValidos*100/eleitores;
	
		final int porcentagemValorTotal = 100;
		
		System.out.println("\nA porcentagem correspondente aos votos brancos : "+percentualVotosBrancos);
		System.out.println("\nA porcentagem correspondente aos votos brancos : "+percentualVotosValidos);
		System.out.println("\nA porcentagem correspondente a todos os elitores corresponde a: "+percentualNulos);
		System.out.println("\nA porcentagem correspondente a todos os elitores corresponde a: "+porcentagemValorTotal+" %");
	
			sc.close();
	}

}
