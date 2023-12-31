package estruturaWhile;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Estrutura Repetitiva WHILE (Enquanto)
		 * 
		 * É uma etrutura de controle que repete um bloco de comandos
		 * Enquanto uma condição for verdadeira.
		 * 
		 * USAR: quando NÃO se sabe previamente a quantidade de repetições
		 * que será realizada.
		 */
		
		//PROBLEMA EXEMPLO
		
		/*
		 * Fazer um programa que lê números até que um zero seja lido.
		 * ao final mostra a soma dos números lidos.
		 * 
		 * ENTRADA                   SAÍDA
		 * 5                         11
		 * 2
		 * 4
		 * 0
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while(x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		sc.close();
	}

}
