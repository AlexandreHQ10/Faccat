/*12) ESCREVA  UM  ALGORITMO  PARA  LER  UMA  TEMPERATURA  EM  GRAUS  FAHRENHEIT,  CALCULAR  E  ESCREVER  O  VALOR 
 CORRESPONDENTE EM GRAUS CELSIUS (BASEADO NA FÓRMULA ABAIXO): 

				  C					   F - 32
		    -----------		=	    ------------
				  5                            9

*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio12Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor da temperatura em Fahrenheit: ");
		double fahrenheit = sc.nextDouble();

		System.out.println("Valor da temperatura em Celsius: ");
		double celsius = sc.nextDouble();
		
		celsius =( fahrenheit - 32 ) * 5 / 9;
		System.out.println("A temperatura em Celsius é: " + celsius + "°C");
		
		sc.close();
	} 
	
}
