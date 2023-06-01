/*ESCREVA UM ALGORITMO QUE ARMAZENE O VALOR 10 EM UMA VARIÁVEL A E O VALOR 20
   EM UMA VARIÁVEL B. A  SEGUIR  (UTILIZANDO  APENAS  ATRIBUIÇÕES  ENTRE  VARIÁVEIS) 
    TROQUE  OS  SEUS  CONTEÚDOS  FAZENDO  COM  QUE  O VALOR QUE ESTÁ EM A PASSE 
    PARA B E VICE-VERSA. AO FINAL, ESCREVER OS VALORES QUE FICARAM ARMAZENADOS NAS 
    VARIÁVEIS.  
*/

package exerciciosFaccat;

public class Exercicio01Faccat {

	public static void main(String[] args) {
		
		int  valorA = 10;
		int  valorB = 20;
		
		int trocar = valorA;
		valorA = valorB;
		valorB = trocar;

		System.out.println("Valor de A: " + valorA);
		System.out.println("Valor de B: " + valorB);
		
	}

}
