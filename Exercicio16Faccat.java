/*16) AS  MAÇAS  CUSTAM  R$  1,30  CADA  SE  FOREM  COMPRADAS  MENOS  DE  UMA  DÚZIA, 
E  R$  1,00  SE  FOREM COMPRADAS  PELO  MENOS  12.  ESCREVA  UM  PROGRAMA  QUE  LEIA  O  NÚMERO 
 DE  MAÇÃS  COMPRADAS, CALCULE  E ESCREVA O CUSTO TOTAL DA COMPRA.*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio16Faccat {

	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(System.in);

			System.out.println("Digite a quantidade de maçãs compradas : ");
			int macas = sc.nextInt();
			if (macas < 1) {
				System.out.println("Digite um numerode maçãs validos");
			} else if (macas < 12) {
				double resultado = macas * 1.3;
				System.out.println("o valor a ser pago é : R$" + resultado);

			} else {
				double total = macas * 1;
				System.out.println("o valor a ser pago é : R$" + total);

			}
			sc.close();
		} catch (Exception e) {
			System.out.println("Digite somente números inteiros " + e);

		}
	}

}
