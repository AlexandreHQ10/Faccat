/*23)  PARA  O  ENUNCIADO  A  SEGUIR  FOI  ELABORADO  UM  ALGORITMO 
EM  PORTUGUÊS ESTRUTURADO  QUE CONTÉM ERROS, IDENTIFIQUE OS 
ERROS NO ALGORITMO APRESENTADO ABAIXO:ENUNCIADO:
TENDO COMO DADOS DE ENTRADA O NOME, A ALTURA E O SEXO (M OU F)
DE UMA PESSOA, CALCULE E MOSTRE SEU PESO IDEAL, UTILIZANDO AS 
SEGUINTES FÓRMULAS:
PARA SEXO MASCULINO:  PESO IDEAL = (72.7 * ALTURA) 
   - 58 -
PARA SEXO FEMININO:  PESO IDEAL = (62.1 * ALTURA)*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio23Faccat {

	public static void main(String[] args) {
		
		double pesoIdeal = 0;
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Qual o seu nome?");
			String nome = sc.next();
	
			System.out.println("Qual o seu sexo?");
			char sexo = sc.next().charAt(0);
			System.out.println(sexo);
	
			System.out.println("Qual a sua altura?");
			float altura = sc.nextFloat();
	
			if (( sexo == 'm'  )||( sexo == 'M' )) {
	
				pesoIdeal = ( 72.7 * altura ) - 58;
			} else if (( sexo == 'f'  )||( sexo == 'F' ))
			{
				pesoIdeal = ( 62.1 * altura) - 44.7;
				System.out.println("Peso Ideal do(a)é " + nome + " é " + pesoIdeal);
			}else{
				System.out.println("O caracter digitado não corresponde a nenhum sexo.");
			}	sc.close();
	}
}
