package Programa;

import java.util.Locale;
import java.util.Scanner;

import Entities.Formula;

public class Retangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Formula rect = new Formula();
		
		//Recebendo Dados
		System.out.println("Enter rectangle width and height");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", rect.area());
		System.out.printf("Perimeter = %.2f%n", rect.perimeter());
		System.out.printf("Diagonal = %.2f%n", rect.Diagonal());
		
		sc.close();

	}

}
