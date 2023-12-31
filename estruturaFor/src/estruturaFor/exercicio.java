package estruturaFor;
import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		/*
		 * Leia 1 valor inteiro N(2<N<1000). A seguir, mostre a tabuada de N:
		 * 1 X N = N  
		 * 2 x N = 2N
		 * ....
		 * 10 x n = 10N
		 * 
		 * ENTRADA 
		 * 
		 * A entrada contém um valor inteiro N(2 < n < 1000).
		 * 
		 * SAÍDA
		 * 
		 * Imprima a tabuada de N,conforme o exemplo fornecido.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int i = 0;
		int cont;
		
			for (i = 0; i < 100; i++) {
				cont = 0;
				cont = i * x;
				System.out.println(cont + " x " + x + " = " + cont);
			}
		
		sc.close();
	}

}
