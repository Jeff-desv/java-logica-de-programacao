package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// EXERCÍCIO 2
		/*
		 * Faça um programa que leia N números reais e armazene-os 
		 * em um vetor. Em seguida:
		 * -Imprimir todos os elementos do vetor;
		 * -Mostrar na tela a soma e a média dos elementos do vetor;
		 * 
		 * ENTRADA:                               SAÍDA:
		 * 4                                      8.0; 4.0; 10.0; 14;0
		 * 8.0                                    36.00
		 * 4.0                                    9.00
		 * 10.0
		 * 14.0
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double N = sc.nextDouble();
		double vet[] = new double[(int) N];
		
		//LEITURA DO VETOR
		for(int i = 0; i < N; i++) {
			vet[i]= sc.nextDouble();
		}
		for(int i = 0; i < N; i++) {
			System.out.printf("%.1f%n", vet[i]);
		}
		
		//FAZENDO A SOMA
		double soma = 0.0;
		for(int i = 0; i < N; i++) {
			soma += vet[i];
		}
		System.out.println();
		System.out.printf("%.2f%n", soma);
		
		//FAZENDO A MÉDIA
		double media = 0.0; 
		for(int i = 0; i < N; i++) {
			media = soma / 4;
		}
		System.out.println();
		System.out.printf("%.2f%n", media);
		sc.close();

	}

}
