/*6)  ESCREVA  UM  ALGORITMO  PARA  LER  AS  DIMENSÕES  DE  UM  RETÂNGULO (BASE  E  ALTURA), 
 CALCULAR  E  ESCREVER  A ÁREA DO RETÂNGULO. */

package exerciciosFaccat;

import java .util.Scanner;

public class Exercicio06Faccat {
	
	public static void main(String[] args) {
	try {
Scanner  sc = new Scanner(System.in);
		
		System.out.println("Digite a base : ");
		double  a = sc.nextDouble();
		System.out.println("Digite a altura : ");
		double  h = sc.nextDouble();
		
		if( a ==h ) {
			System.out.println("Digite valores diferentes. ");
		} else if (a > 0 && h > 0) {
		double resultado = a* h;
				System.out.println("A área do retangulo é : "+resultado);
		}
		
		sc.close();
		
	} catch (Exception e) {
		System.out.println("Favor inserir um número correto" + e);
	}	
	
		}
}
