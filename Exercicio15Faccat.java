/*15) LER UM VALOR E ESCREVER SE É POSITIVO OU NEGATIVO 
(CONSIDERE O VALOR ZERO COMO POSITIVO).*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio15Faccat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor :");
		int valor = sc.nextInt();

		if (valor >= 0) {
			System.out.println("Número digitado é positivo");
		} else {
			System.out.println("Número digitado é negativo");
		}
		sc.close();
	}

}
