package exercicioURI;

import java.util.Scanner;
import java.util.Locale;

public class exercicio5 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o nome (Apenas uma Palavra) e idade 
		 * de duas pessoas. Ao final mostrar uma mensagem com os nomes 
		 * e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo.
		 * 
		 * Entrada:                Saída:
		 * 
		 * Maria 19                A idade de Maria e Joaquim é de 
		 * Joaquim 20              19.5 anos.
		 */
		 
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite dois nomes");
		String nome1 = sc.next();
		String nome2 = sc.next();
		System.out.println("Digite duas Idades");
		double x, y, media;
		x = sc.nextDouble();
		y = sc.nextDouble();
		media = (x + y) / 2;
		System.out.printf("A idade de %s e %s é de %.1f%n", nome1, nome2, media);
		
		
		sc.close();
	}

}
