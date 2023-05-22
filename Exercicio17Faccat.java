/*17)  LER  AS  NOTAS  DA  1A.  E  2A.  AVALIAÇÕES  DE  UM  ALUNO. CALCULAR  A  MÉDIA ARITMÉTICA 
SIMPLES  E  ESCREVERUMA MENSAGEM QUE DIGA SE O ALUNO FOI OU NÃO APROVADO 
(CONSIDERAR QUE NOTA IGUAL OU MAIOR QUE 6 O ALUNO É APROVADO). 
ESCREVER TAMBÉM A MÉDIA CALCULADA. */

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio17Faccat {

	public static void main(String[] args) {

		try {

			Scanner sc = new Scanner(System.in);

			System.out.println("Digite a primeira nota da prova : ");
			double nota1 = sc.nextInt();

			System.out.println("Digite a segunda nota da prova : ");
			double nota2 = sc.nextInt();

			double media = (nota1 + nota2) / 2;
			System.out.println("O nota da média é " + media);

			if ((media < 0) || (media > 10) || (media < 0)) {
				System.out.println("o programa aceita somente números entre 0 e 10. ");
			} else if (media >= 6) {
				System.out.println("Aluno(a) aprovado(a) com sucesso. Sua média foi: " + media);
			}
			sc.close();

		} catch (Exception e) {
			System.out.println("O programa não aceita caracteres. " + e);
		}
	}
}
