/*18)  LER  O  ANO  ATUAL  E  O  ANO  DE  NASCIMENTO  DE  UMA  PESSOA. ESCREVER  UMA MENSAGEM 
QUE  DIGA  SE  ELA PODERÁ OU NÃO VOTAR ESTE ANO (NÃO É NECESSÁRIO CONSIDERAR O MÊS EM 
QUE A PESSOA NASCEU).*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio18Faccat {

	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(System.in);

			System.out.println("Qual o ano atual ? ");
			int anoAtual = sc.nextInt();
			System.out.println("Qual o ano de nascimento ? ");
			int anoNasc = sc.nextInt();
			int idadeAtual = anoAtual - anoNasc;

			if (idadeAtual < 0) {
				System.out.println("Não é possivel ter uma idade menor que zero! ");
				System.out.println("Viagens no tempo ainda não são possiveis! ");
			} else if (idadeAtual >= 16) {
				System.out.println("Você possui a idade necessária para votar! ");
			} else {
				System.out.println("Você não possui idade para votar! ");
			}
			sc.close();

		} catch (Exception e) {
			System.out.println("Digite somente números inteiros " + e);
		}
	}
}
