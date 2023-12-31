package matrizes;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * VETORES:
		 * 
		 * Corresponde a uma coleção de Dados de Tamanhgo fixo,
		 * indexada, unidimensional e homogênea
		 * 
		 * Indexada: os elementos são acessados por meio de índices
		 * 
		 * Unidimensional: Uma Dimensão
		 * 
		 * Homogênea: Todos os Dados são do mesmo Tipo.
		 * 
		 * EXEMPLOS:
		 * 
		 * 0 [Maria]   Índice 0
		 * 1 [João]    Índice 1
		 * 2 [Carlos]  Índice 2
		 * 3 [Ana]     Índice 3
		 * 4 [Joaquim] Índice 4
		 * 
		 * A PRIMEIRA POSIÇÃO DE UM VETOR(MATRIZ), SEMPRE SERÁ A POSIÇÃO 0
		 */
		
		/*
		 * CRIANDO UM VETOR
		 * 
		 * DECLARAÇÃO;
		 *  INT[] A; VETOR DE INTEIROS;
		 *  DOUBLE[] B; VETOR DE NÚMEROS FLUTUANTES 
		 *  STRING[] C; VETOR DE STRINGS(PALAVRAS)
		 *  
		 *  INSTANCIAÇÃO: INFORMANDO O TAMANHO DO VETOR
		 *  INT[] A = new int[10]; TAMANHO DO VETOR
		 *  DOUBLE[] B = new double[5]; TAMANHO DO VETOR
		 *  
		 *  Acessando os Elementos de um Vetor
		 *  
		 *  A[3] = 10; O 3 é a posição a ser acessada e o 10 
		 *             é o número a ser inserido nessa posição do vetor;
		 */
		
		//PROBLEMA EXEMPLO:
		/*
		 * Fazer um programa para ler um número inteiro positivo N, depois ler 
		 * N números quaisquer e armazená-los em um vetor. Em seguida, mostrar na 
		 * tela todos elementos do vetor 
		 * 
		 * ENTRADA:                     SAÍDA
		 * 4                            10.5
		 * 10.5                         4.2
		 * 4.2                          -7.1
		 * -7.1                         15.0
		 * 15.0
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		//Criando o Vetor
		double[] vet = new double[N]; //N é o tamanho do Vetor
		
		//ADCIONANDO(PREENCHENDO) OS ELEMENTOS DENTRO DO VETOR
		for(int i=0; i<N; i++) {
			//O i vair servir para acessar os Indices do vetor
			//N irá valer o número que for digitado, nesse caso N será 4
			
			vet[i] = sc.nextDouble();
			
			/*
			 * Vetor na posição i(0) recebe o primeiro número, 
			 * depois será somado 0 + 1 e o vetor irá valer 1,
			 * até chegar o valor de 4, onde o programa irá terminar.
			 */
		}
		
		System.out.println();
		System.out.println("Valor Impresso");
		System.out.println();
		
		//IMPRIMINDO OS VALORES UTILIZANDO O FOR
		for(int i=0; i<N; i++) {
			System.out.printf("%.2f%n", vet[i]);
		}
		sc.close();		 
		

	}

}
