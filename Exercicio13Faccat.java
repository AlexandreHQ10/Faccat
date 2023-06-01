/*13)  FAÇA  UM  ALGORITMO  QUE  LEIA  TRÊS  NOTAS  DE  UM  ALUNO,  CALCULE  E  ESCREVA  A  MÉDIA  FINAL  DESTE  ALUNO. 
 CONSIDERAR QUE A MÉDIA É PONDERADA E QUE O PESO DAS NOTAS É 2, 3 E 5. FÓRMULA PARA O CÁLCULO DA MÉDIA FINAL É: 

												     n1 * 2 + n2 * 3 + n3 * 5
				MEDIAFINAL  =		-----------------------------------
																   	10
*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio13Faccat {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual foi a sua primeira nota ? ");
		int primeiraNota = sc.nextInt();
		System.out.println("Qual foi a sua segunda nota ? ");
		int segundaNota = sc.nextInt();
		System.out.println("Qual foi a sua terceira nota ? ");
		int terceiraNota = sc.nextInt();
		
		int pesoDaNota1 = 2;
		int pesoDaNota2 = 3;
		int pesoDaNota3 = 5;
		
		int mediaFinal = (primeiraNota * pesoDaNota1 + segundaNota * pesoDaNota2 + terceiraNota * pesoDaNota3) / 10 ; 
		
		System.out.println("A média final será : " + mediaFinal + ". ");
		
		sc.close();
		
	}

}
