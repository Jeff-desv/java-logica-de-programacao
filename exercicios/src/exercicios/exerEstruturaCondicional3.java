package exercicios;
import java.util.Scanner;

public class exerEstruturaCondicional3 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler três números inteiros. Em seguida,
		 * mostrar qual o menor dentre os três números lidos. Em caso de empate,
		 * mostrar apenas uma vez.
		 * 
		 * ENTRADA:                   SAÍDA:
		 * 7 3 8                      MENOR = 3
		 * 
		 * 5 12 5                     MENOR = 5
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if(num1 < 5 || num1 <=5) {
			System.out.println("MENOR = " + num1);
		} else if(num2 < 5 || num2 <=5) {
			System.out.println("MENOR = " + num2);
		} else {
			System.out.println("MENOR = " + num3);
		}

	}

}
