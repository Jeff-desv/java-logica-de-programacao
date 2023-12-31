package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exerEstruturaCondicional2 {

	public static void main(String[] args) {
		/*
		 * Leia 3 Valores de ponto flutuante(Double) e efetue o cálculo das 
		 * raizes da equação de Bhaskara. Se não for possível calcular as raizes,
		 * mostre a mensagem "IMPOSSIVEL CALCULAR", caso haja uma divisão por 0
		 * ou Raiz de numero negativo.
		 * 
		 * ENTRADA                         SAÍDA
		 * 
		 * Leia três valores de            Se não houver possibilidae de Calcular as raízes
		 * ponto flutuante(Double)         apresente a mensagem "IMPOSSIVEL CALCULAR". Caso
		 * A, B e C.                       contrário imprima o resultado das raizes com 5 digitos.
		 * 
		 * EXEMPLOS DE ENTRADA             EXEMPLOS DE SAÍDA
		 * 
		 * 10.0 20.1 5.1                   R1 = -0.29788
		 *                                 R2 = -1.71212
		 *                                 
		 * 0.0 20.0 5.0                    IMPOSSÍVEL CALCULAR                                      
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, delta;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		delta = B * B - 4.0 * A * C;
		
		if(A == 0 || delta < 0.0) {
			System.out.println("Impossível Calcular");
		} else {
			double r1 = (-B + Math.sqrt(delta))/(2*A);
			double r2 = (-B - Math.sqrt(delta))/(2*A);
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}
		
		
		sc.close();

	}

}
