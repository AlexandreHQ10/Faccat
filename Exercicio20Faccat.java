/*20) LER DOIS VALORES (CONSIDERE QUE NÃO SERÃO LIDOS VALORES IGUAIS) 
E ESCREVÊ-LOS EM ORDEM CRESCENTE. */

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio20Faccat {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro valor : ");
		double valor1 = sc.nextDouble();
		System.out.println("Escreva o segundo valor : ");
		double valor2 =sc.nextDouble();
		
		if ( valor1 == valor2 ) {
			System.out.println("Digite valores distintos ");
		}
		else if (valor1 < valor2) {
			System.out.println("O menor  valor digitado foi : "+valor1+" e o maior valor digitado foi : "+valor2);
		}  else {
			System.out.println("O menor  valor digitado foi : "+valor2+" e o maior valor digitado foi : "+valor1);
			
		}
		sc.close();
	}
}

