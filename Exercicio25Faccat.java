/*25) FAÇA UM  ALGORITMO PARA LER: NÚMERO DA  CONTA DO CLIENTE, SALDO, 
DÉBITO E  CRÉDITO. APÓS,  CALCULAR E ESCREVER O SALDO ATUAL 
(SALDO ATUAL = SALDO - DÉBITO + CRÉDITO). TAMBÉM TESTAR SE SALDO
ATUAL FOR MAIOR OU IGUAL A ZERO ESCREVER A MENSAGEM 'SALDO POSITIVO', 
SENÃO ESCREVER A MENSAGEM 'SALDO NEGATIVO'. */

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio25Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o número da conta do cliente: ");
		int numeroDaConta = sc.nextInt();
	
		System.out.println("Insira o saldo da conta : ");
		double saldo = sc.nextDouble();
		
		System.out.println("Insira o valor do débito : ");
		double debito = sc.nextDouble();
		
		System.out.println("Insira o valor do crédito : ");
		double credito = sc.nextDouble();
		double saldoAtual = saldo + debito + credito;
		
		if ( saldoAtual >= 0)  
		{
			System.out.println(" Saldo Positivo ");
		} else {
			System.out.println(" Saldo Negativo ");
		}
		
		System.out.println(" Saldo Atual em caixa: R$ " + saldoAtual );

	}

}
