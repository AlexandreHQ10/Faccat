/*9) ESCREVA UM ALGORITMO PARA LER O SALÁRIO MENSAL ATUAL DE UM FUNCIONÁRIOE
 *  O PERCENTUAL DE REAJUSTE. CALCULAR E ESCREVER O VALOR DO NOVO SALÁRIO. */

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio09Faccat {
	
	public static void main(String[] args)
	{
		
		Scanner calc =new Scanner(System.in);
		
		System.out.println("Digite o salário atual do funcionário: ");
		double salario = calc.nextDouble();
		
		System.out.println("Digite o percentual de reajuste do salário do funcionário: ");
		double reajuste = calc.nextDouble();
		
		double valorRealDoReajuste = reajuste * salario/100;
		double salarioFinal = valorRealDoReajuste + salario;
		
		 System.out.printf("A salário atual é: R$ %.2f",salarioFinal);
	
		 calc.close();
		 
	}

}
