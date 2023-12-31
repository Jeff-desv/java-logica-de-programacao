package exercicioURI;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		/*
		 * Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma 
		 * de A e B atribuindo o seu resultado na variável X. Imprima X conforme apresentado
		 * abaixo. Não esqueça apresente mensagem alguma além daquilo que está sendo especificado e 
		 * não esqueça de imprimir o fim da linha após o resultado, caso contrário, você receberá "Presentation Error".
		 * 
		 * Entrada:
		 * A entrada contém 2 valores inteiros.
		 * 
		 * Saída
		 * Imprima a mensagem "X = "(letra X maíuscula) seguido pelo valor da variável X e pelo
		 * final de linha. Cuide para que tenha um espaço antes e depois do sinal de igualdade,
		 * conforme o exemplo abaixo.
		 * 
		 * Exemplos de Entrada              Exemplos de Saída
		 * 
		 * 10                               X = 19
		 * 9
		 * 
		 * -10                              X = - 6
		 * 4
		 * 
		 * 15
		 * -7                               X = 8
		 */
		 Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int a, b, x;
		a = sc.nextInt();
		b = sc.nextInt();
		x = a + b;
		
		System.out.printf(" X = " + x);

	}

}
