/*22) A JORNADA DE TRABALHO SEMANAL DE UM FUNCIONÁRIO É DE 40 HORAS.
O FUNCIONÁRIO QUE TRABALHAR MAIS DE  40  HORAS RECEBERÁ  HORA  EXTRA, 
CUJO  CÁLCULO  É  O  VALOR  DA  HORA  REGULAR  COM  UM  ACRÉSCIMO  DE  50%. 
ESCREVA UM ALGORITMO QUE LEIA O NÚMERO DE HORAS TRABALHADAS EM UM MÊS, 
O SALÁRIO POR HORA E ESCREVA O SALÁRIO TOTAL DO FUNCIONÁRIO, 
QUE DEVERÁ SER ACRESCIDO DAS HORAS EXTRAS, CASO TENHAM SIDO TRABALHADAS
(CONSIDERE QUE O MÊS POSSUA 4 SEMANAS EXATAS). */

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio22Faccat {

	public static void main(String[] args) {
			try (Scanner sc = new Scanner (System.in)) {
				System.out.println("Digite a quantidade de horas trabalhadas em um mês: ");
				int horasTrabalhadas = sc.nextInt();
				
				System.out.println("Digite o valor recebido por cada hora trabalhada: ");
				float valorHora = sc.nextFloat();
				
				if  (horasTrabalhadas < 161) 
				{
					float salarioFinal = horasTrabalhadas * valorHora;
					System.out.println("O valor a ser recebido é " + salarioFinal);
				
				} else {
					float salarioFinal = (160 * valorHora + valorHora + valorHora * 50/100 );
					System.out.printf("O valor a ser recebido é  : R$ %.2f" ,salarioFinal);
				}
			}
	}

}
