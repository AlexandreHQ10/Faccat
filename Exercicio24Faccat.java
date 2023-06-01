/*24) LER O SALÁRIO FIXO E O VALOR DAS VENDAS EFETUADAS PELO VENDEDOR DE 
UMA EMPRESA. SABENDO-SE QUE ELE  RECEBE  UMA  COMISSÃO  DE  3%  SOBRE 
O  TOTAL  DAS  VENDAS  ATÉ  R$  1.500,00  MAIS  5%  SOBRE  O  QUE ULTRAPASSAR
ESTE VALOR, CALCULAR E ESCREVER O SEU SALÁRIO TOTAL. */

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio24Faccat {
			
		public static void main(String[] args) {
			
			double comissao = 0 , salarioTotal =0;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Qual o valor do salário fixo :  ");
			double salarioFixo = sc.nextDouble();
			
			System.out.println("Qual o valor das vendas efetuadas :  ");
			double vendasEfetuadas = sc.nextDouble();
			
			if ( salarioTotal <= 1500) 
			{
				comissao = vendasEfetuadas * 0.03;
			} else {
				comissao = 1500 * 0.03 + (vendasEfetuadas - 1500) * 0.05;
			}
			salarioTotal = salarioFixo + comissao;
			
			System.out.println("O seu salário total é : R$" + salarioTotal );
			
			sc.close();
		}	
}

