package estruturaWhile;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		/*Leia uma quantidade indeterminada de duplas de valores inteiros
		 * X e Y. Escreva para cada X e Y uma mensagem que indique estes valores
		 * foram digitados em ordem crescente ou decrescente.
		 * 
		 * ENTRADA
		 * A entrada contém vários casos de teste. Cada caso contém dois valores inteiros 
		 * X e Y. A leitura deve ser encerrada ao ser fornecido valores iguais para X e Y.
		 * 
		 * SAÍDA 
		 * Para cada caso de teste ímprima "Crescente", caso os valores tenham sido digitados na 
		 * ordem contrária imprima a mensagem "Decrescente".
		 * 
		 * EXEMPLO ENTRADA                           EXEMPLO SAÍDA
		 * 5 4                                       Decrescente
		 * 7 2                                       Decrescente
		 * 3 8                                       Crescente
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		
		while(x > y) {
			
			System.out.println(x + " " + y + " Decrescente"); 
			break;
		}
		System.out.println(x + " " + y + " Crescente");
		
		
		sc.close();
	}

}
