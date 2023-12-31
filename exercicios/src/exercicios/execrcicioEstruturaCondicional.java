package exercicios;

import java.util.Scanner;
import java.util.Locale;

public class execrcicioEstruturaCondicional {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler as duas notas que um aluno obteve
		 * no primeiro e segundo semestre de uma disciplina anual. Em seguida,
		 * mostrar a nota final que o aluno obteve no ano juntamente com um texto
		 * explicativo. Caso a nota final do aluno seja inferior a 60.00, mostrar a 
		 * mensagem "REPROVADO", conforme exemplos. Todos os valores devem ter uma casa decimal.
		 * 
		 * EXEMPLOS:
		 * 
		 * ENTRADA:                             SAÍDA:
		 * 45.5                                 NOTA FINAL = 76.8
		 * 31.3                                 APROVADO
		 *  
		 * ENTRADA:                             SAÍDA:
		 * 34.0                                 NOTA FINAL = 57.5                     
		 * 23.5                                 REPROVADO
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double nota1, nota2, soma;
		
		System.out.println("Digite as duas notas");
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		soma = nota1 + nota2;
		
		if (soma >= 60.0) {
			System.out.printf("Parabéns!! Sua NOTA FINAL %f e você foi APROVADO", soma);
		} else {
			System.out.printf("Ooh, que pena, Sua NOTA FINAL %f e você está REPROVADO", soma);
		}
		

	}

}
