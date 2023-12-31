package exercicioURI;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler as medidas da base e altura de um retângulo.
		 * Em seguida, mostrar o valor da área, perímetro e diagonal deste retângulo,
		 * com quatro casas decimais, conforme exemplo:
		 * 
		 * Entrada:                          Saída:
		 * 
		 * 5.0                               AREA = 20.0000
		 * 4.0                               PERIMETRO = 18.0000
		 *                                   DIAGONAL = 6.4031
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, h, p, d;
		a = sc.nextDouble();
		b = sc.nextDouble();
		h = b*a;//área
		p = 2*(b+a);//perímetro
		d = Math.sqrt(Math.pow(b, 2.0) + Math.pow(a, 2.0));
		System.out.println("AREA = " + h);
		System.out.println("PERIMETRO = " + p);
		System.out.println("DIAGONAL = " + d);
		

	}

}
