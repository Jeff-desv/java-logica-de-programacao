package entradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	/*Para fazer entrada de dados, precisamos criar um objeto do tipo
	 * Scanner da seguinte forma:
	 * 
	 * Scanner sc = new Scanner(System.in);
	 * 
	 * faça sc.close() quando não precisar mais do Objeto.
	 * 
	 */
	
	Scanner sc = new Scanner(System.in);
	
	//String x;
	//int y;
	//double z;
	
	//x = sc.next();//Para Strings
	//y = sc.nextInt();//Para números inteiros 
	//z = sc.nextDouble();//Para números com ponto e virgula
	
	//System.out.println("Você digitou: " + x);
	//Locale.setDefault(Locale.US);
	//System.out.println("Você digitou: " + y);
	//System.out.println("Você digitou: " + z);
	
	/*
	 * Para ler um texto com mais de uma palavra até a quebra de linha usamos sc.nextLine();
	 * vejamos:
	 */
	
	String s1, s2, s3;
	
	s1 = sc.nextLine();
	s2 = sc.nextLine();
	s3 = sc.nextLine();
	
	
	sc.close();
	
  }

}
