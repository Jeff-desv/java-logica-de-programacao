package funcoesMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("Exercício Operações Matemáticas");
		System.out.println();
		
		/*
		 * Fazer um programa para ler as medidas da largura e comprimento de 
		 * um terreno retangular com uma casa decimal, bem como o valor do metro quadrado
		 * do terreno com duas casas decimais. Em seguida, o programa deve mostrar o valor da 
		 * área do terreno, bem como o valor do preço do terreno, ambos com duas casas decimais, con
		 * conforme exemplo.
		 * 
		 * Entrada:                             Saída:
		 * Largura          10.0                AREA = 300.00
		 * Comprimento      30.0                PRECO = 60000.00
		 * Preço por Metro  200.0
		 * 
		 * Fórmula 
		 * 
		 * área = largura x comprimento
		 * preço = área x preço do metro quadrado
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double l, c, p;
		
		System.out.println("Qual a Largura do terreno?");
	    l = sc.nextDouble();
	    System.out.println("Qual o Comprimento do Terreno?");
	    c = sc.nextDouble();
	    System.out.println("Qual o Preço do Terreno");
	    p = sc.nextDouble();
	    
	    System.out.println();
	    System.out.println();
	    
	    double area = l * c;
	    System.out.println("A área do Terreno é " + area);
	    double preco = area * p;
	    System.out.println("O preço do Terreno é: R$ " + preco);
		
		sc.close();

	}

}
