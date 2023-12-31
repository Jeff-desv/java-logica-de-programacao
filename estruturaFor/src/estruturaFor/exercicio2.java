package estruturaFor;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		/*
		 * leia 2 valores inteiros X e Y. A seguir, calcule e mostre a 
		 * soma dos números impares entre eles.
		 * 
		 * ENTRADA
		 * O Arquivo de Entrada contém dois valores inteiros 
		 * 
		 * SAIDA
		 * O programa deve imprimir um valor inteiro. Este valor é a soma 
		 * dos valores ímpares que estão entre os fornecidos na entrada 
		 * que deverá caber em um inteiro.
		 * 
		 * EXEMPLO DE ENTRADA                   EXEMPLO DE SAÍDA
		 * 
		 * 6                                    5
		 * -5
		 * 
		 * 15                                   13
		 * 12
		 * 
		 * 12                                   0
		 * 12
		 */
		
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int min,max;
		if(x < y){
			min = x;
			max = y;
		} else {
			min = y;
			max = x;
		}
		int soma = 0;
		for (int i = min+1; i<max; i++) {
			if(i % 2 != 0) {
				soma = soma + i;
			}
		}
		
		System.out.println(soma);
		
		
		
		sc.close();
		

	}

}
