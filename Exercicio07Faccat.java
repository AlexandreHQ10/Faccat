/* 7) FAÇA UM ALGORITMO QUE LEIA A IDADE DE UMA PESSOA EXPRESSA EM ANOS,
 * MESES E DIAS E ESCREVA A IDADE DESSA PESSOA EXPRESSA APENAS EM DIAS.
 * CONSIDERAR ANO COM 365 DIAS E MÊS COM 30 DIAS.*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio07Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nDigite sua idade em anos: ");
		int	ano = sc.nextInt();			
		
		System.out.print("\nDigite a quantidade de messes que passou do seu último aniversário: ");
		int	mes = sc.nextInt();			
		
		System.out.print("\nDigite a quantidade de messes que passou do seu último mesversário: ");
		int	dia = sc.nextInt();			
				
		int diasVividos = ano * 365;
		
		System.out.println("\nA idade em dias, messes e anos é repectivamente:  "+ano+" anos "+mes+" meses "+dia+" dias");
		System.out.println("\nA quantidade de dias vividos corresponde a : "+diasVividos);
	
		sc.close();
	
	}

}
