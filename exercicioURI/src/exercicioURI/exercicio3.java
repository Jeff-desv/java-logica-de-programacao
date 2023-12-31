package exercicioURI;
import java.util.Scanner;
import java.util.Locale;

public class exercicio3 {

	public static void main(String[] args) {
		/*
		 * 

			Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. 
			A seguir escrever o valor desta variável.
			Entrada
			
			O arquivo de entrada contém 2 valores inteiros.
			Saída
			
			Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço em branco antes e depois da igualdade seguido pelo 
			valor correspondente à soma de A e B. Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso 
			contrário, você receberá "Presentation Error".
			
			Exemplos de Entrada 	Exemplos de Saída

			30                      SOMA = 40
			10

			-30                     SOMA = -20
			10

			0                       SOMA = 0 
			0
		 */
		
		  Scanner sc = new Scanner(System.in);
		  
		  int A, B, soma;
		  A = sc.nextInt();
		  B = sc.nextInt();
		  soma = A + B;
		  
		  System.out.println("SOMA = " + soma);
	}

}
