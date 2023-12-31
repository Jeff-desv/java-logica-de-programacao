package saidaDados;

import java.util.Locale;

public class Main {
	
	public static void main (String[] args) {
		
		
Locale.setDefault(Locale.US);//Usado para deixar a linguagem com os padrões americanos.
		
		int y = 32;
		double x = 10.3980;//Usamos Double para declarar variáveis numéricas com numeros decimais.
		
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);//"%.2f%n" é usado para diminuir(arredondar) as casas decimais.
		System.out.printf("%.4f%n", x);//O numero antes do F vai dizer quantas casas decimais terá que ser mostrada.
		System.out.print("Olá Mundo!");
		System.out.println();
		System.out.println();
		System.out.println("Exercício");
		System.out.println();
		System.out.println("Faça a concatenação dos elementos presentes no Código");
		
		int a = 32;
		String info = "O predio tem quantos metros?";
		String resp = "O prédio tem";
		String resp2 = "metros de altura.";
		System.out.println();
		System.out.println(info);
		System.out.println(resp + " " + a + " " + resp2);
		System.out.println();
		System.out.println();
		//Para Concatenar vários elementos em um mesmo comando de escrita 
		// %f = Ponto Flutuante 
		// %d = Inteiro 
		// %s = Texto(String)
		// %n = quebra de linha 
		
		System.out.println("Concatenando vários elementos");
		System.out.println();
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome , idade, renda);
		
	}

}
