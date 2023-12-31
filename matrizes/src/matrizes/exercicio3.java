package matrizes;

import java.util.Scanner;
import java.util.Locale;

public class exercicio3 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número N, depois nome
		 * (Apenas uma palavra sem espaços), idade e altura de N
		 * pessoas, conforme exemplo. Depois, mostrar na tela 
		 * a altura média das pessoas, e mostrar também a 
		 * porcentagem de pessoas com menos de 16 anos.
		 * 
		 * ENTRADA:                              SAÍDA:
		 * 5
		 * 
		 * Joao 15 1.82                          Altura média 1.67
		 * Maria 16 1.60                         Pessoas com menos de 16 anos: 40.0%
		 * Teresa 14 1.58
		 * Carlos 21 1.65
		 * Paulo 17 1.78
		 */
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int N = sc.nextInt();
		String[] nomes = new String[N];
		int[] idades = new int[N];
		double[] alturas = new double[N];
		
		for(int i=0; i<N; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
			alturas[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for(int i=0; i<N; i++) {
			soma = soma + alturas[i];
		}
		
		double media = soma / N;
		System.out.println();
		System.out.printf("Altura média: %.2f%n", media);
		
		int cont = 0;
		for (int i=0; i<N; i++) {
			if(idades[i] < 16) {
				cont = cont + 1;//é o mesmo que cont++
			}
		}
		double x = cont * 100.0 / N;
		System.out.printf("Pessoas com menos de 16 anos:  %.1f%%%n", x);
		
		
		sc.close();

	}

}
