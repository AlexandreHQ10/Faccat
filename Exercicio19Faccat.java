/*19) LER DOIS VALORES (CONSIDERE QUE NÃO SERÃO LIDOS VALORES IGUAIS) E ESCREVERO MAIOR DELES.*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio19Faccat {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro valor : ");
		double valor1 = sc.nextDouble();
		System.out.println("Escreva o segundo valor : ");
		double valor2 =sc.nextDouble();
		
		if (valor1 > valor2) {
			System.out.println("O maior valor digitado foi : "+valor1);
		} else {
			System.out.println("O maior valor digitado foi : "+valor2);
			
		}
		sc.close();
	}
}