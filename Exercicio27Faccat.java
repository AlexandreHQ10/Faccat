/*27) LER UM VALOR E ESCREVER SE É POSITIVO, NEGATIVO OU ZERO.*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio27Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		double valor = sc.nextDouble();
		
		if ( valor > 0 ) {
			System.out.println("O número digitado é positivo. ");
		
		} else if ( valor < 0 ) {
			System.out.println("O número digitado é negativo. ");
		
		} else {
			System.out.println("O número digitado é zero. ");
		
		}sc.close();
	}
}
