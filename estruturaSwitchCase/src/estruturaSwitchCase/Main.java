package estruturaSwitchCase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Quando se tem várias opções de fluxo a serem tratadas
		 * com base no valor de uma variável, ao invés de várias estruturas 
		 * if-else encadeadas, alguns preferem utilizar a estrutura switch-case.
		 */
		
		/*
		 * Problema Exemplo:
		 * 
		 * Fazer um programa para ler um valor inteiro de 1 a 7 representando 
		 * um dia da semana (Sendo 1 = domingo, 2 = segunda, e assim por diante).
		 * Escrever na tela o dia da semana correspondente, conforme exemplos.
		 * 
		 * Entrada:                       Saída:
		 * 1                              Dia da Semana: Domingo
		 * 
		 * 4                              Dia da Semana: Quarta 
		 * 
		 * 9                              Valor Inválido
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia = null;
		
		switch(x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Valor Inválido";
			break;
		}
		
		System.out.println("Dia da Semana = " + dia);
		sc.close();

	}

}
