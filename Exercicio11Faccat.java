/*11) UMA REVENDEDORA DE CARROS USADOS PAGA A SEUS FUNCIONÁRIOS VENDEDORES UM SALÁRIO FIXO POR MÊS,
  MAIS  UMA  COMISSÃO  TAMBÉM  FIXA  PARA  CADA  CARRO  VENDIDO  E  MAIS  5% DO  VALOR  DAS  VENDAS  POR  
  ELE EFETUADAS. ESCREVER UM ALGORITMO QUE LEIA O NÚMERO DE  CARROS POR  ELE VENDIDOS, O VALOR TOTAL
  DE SUAS VENDAS, O SALÁRIO FIXO E O VALOR QUE ELE RECEBE POR CARRO VENDIDO. CALCULE E ESCREVA O SALÁRIO 
  FINAL DO VENDEDOR. 
*/

package exerciciosFaccat;

import java.util.Scanner;
public class Exercicio11Faccat {

	public static void main(String[] args) {
		
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de carros vendidos: ");
		double carrosVendidos = sc.nextDouble();
		
		System.out.println("Digite o valor total das vendas: ");
		double totalDeVendas = sc.nextDouble();
				
		System.out.println("Digite o salário inicial:");
		double salarioInicial = sc.nextDouble();
		
		System.out.println("Digite o valor recebido por carro vendido:");
		double recebidoPorCarro  = sc.nextDouble();
		
		double valorAdicionalTotal = carrosVendidos * recebidoPorCarro;
		
		double porcentagen = 0.05 * totalDeVendas;

		double salarioFinal = salarioInicial + valorAdicionalTotal + porcentagen;
		
		System.out.println("O salário final do vendedor será : R$ " + salarioFinal);

		sc.close();
		
				} catch (Exception e) {
					System.out.println("Favor inserir um número correto" + e);
			}
		}
	}
