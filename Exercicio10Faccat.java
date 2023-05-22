/*10) O  CUSTO  DE  UM  CARRO  NOVO  AO  CONSUMIDOR  É  A  SOMA  DO  CUSTO
DE FÁBRICA  COM  A  PORCENTAGEM  DO DISTRIBUIDOR E DOS IMPOSTOS (APLICADOS AO CUSTO 
DE FÁBRICA). SUPONDO QUE O PERCENTUAL DO DISTRIBUIDOR SEJADE  28%  E  OS  IMPOSTOS  DE
45%,  ESCREVER  UM  ALGORITMO  PARA  LER O  CUSTO DE  FÁBRICA DE  UM  CARRO, CALCULAR
E ESCREVER O CUSTO FINAL AO CONSUMIDOR.*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio10Faccat {

	public static void main(String[] args) {
		
		Scanner calculo = new Scanner (System.in);
		
		System.out.println("Digite o custo de fábrica do veiculo: ");
		double custoFabrica = calculo.nextDouble();
		
		double porcentualDistribuidor = 28;
		double valorDistribuidor =custoFabrica * porcentualDistribuidor/100;
		double porcentualImpostos = 45 ;
		double valorImpostos = custoFabrica * porcentualImpostos/100;
		
		double custoFinal = custoFabrica + valorDistribuidor + valorImpostos;
		
		System.out.printf("O valor em reais do porcentual do distribuidor é : R$ %.2f",valorDistribuidor);
		System.out.printf("\nO valor em reais do porcentual dos impostos é : R$ %.2f",valorImpostos);
		System.out.printf("\nO valor de custo total do carro é : R$ %.2f", custoFinal);
		
		calculo.close();
		
	}

}
