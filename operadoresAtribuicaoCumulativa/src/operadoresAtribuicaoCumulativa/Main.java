package operadoresAtribuicaoCumulativa;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Operadores de Atribuição Cumulativa
		/*
		 * EXEMPLO PRÁTICO
		 * 
		 * Uma operadora de telefonia cobra R$ 50.00 por plano básico
		 * dá direito a 100 minutos de telefone. Cada minuto que exceder a 
		 * franquia de 100 minutos custa 2.00. FAZER UM PROGRAMA PARA LER A 
		 * QUANTIDADE DE MINUTOS QUE UMA PESSOA CONSUMIU< DAI MOSTRAR O VALOR
		 * A SER PAGO>
		 * 
		 * ENTRADA:                    SAÍDA:
		 * 22                          Valor a pagar: R$ 50.00
		 * 
		 * 103                         Valor a pagar: R$ 56.00
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if(minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		sc.close();
		
		/*
		 * Os Operadores de Atribção Cumulativa 
		 * 
		 * a += b;         =     a = a + b;
		 * a -= b;         =     a = a - b;
		 * a *= b;         =     a = a * b;
		 * a /= b;         =     a = a / b;
		 * a %= b;         =     a = a % b;
		 */
	}

}
