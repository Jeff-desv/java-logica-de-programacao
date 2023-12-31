package exercicioURI;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro que é o tempo de duração em segundos
		 * de um determinado evento em uma fábrica e informe-o expresso 
		 * no formato horas:minutos:segundos
		 * 
		 * Entrada                                 Saída
		 * 
		 * O arquivo de entrada contém             Informa o tempo lido do arquivo de entrada
		 * um valor inteiro N.                     (segundos) convertido para horas:minutos:segundo
		 * 
		 * Exemplo de Entrada                       Exemplo de Saída
		 * 556                                      0:9:16
		 * 1                                        0:0:1
		 * 140153                                   38:55:53
		 */
		
		Scanner sc = new Scanner(System.in);
		int N, resto, horas, minutos, segundos;
		
		N = sc.nextInt();
		
		horas = N / 3600;
		resto = N % 3600;
		
		minutos = resto / 60;
		segundos = resto % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		sc.close();
	}

}
