package matriz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler dois números inteiros Positivos 
		 * M e N, depois ler uma matriz de M linhas e N Colunas contendo números Inteiros
		 * Em seguida, mostrar na tela a matriz lida conforme exemplo.
		 * 
		 *  ENTRADA                             SAÍDA
		 *  2 3                        
		 *  6 3 10                              6 3 10
		 *  8 12 5                              8 12 5
		 */
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();//Quantidade de Linhas
		int N = sc.nextInt();//Quantidade de Colunas
		
		int[][] mat = new int[M][N];//Declarando e Instanciando a Matriz;
		//Os dois colchetes informa as dimensões que são Duas dimensões por isso [][]
		
		//Criando o 1º for para percorrer as Linhas(M) da matriz
		for(int i=0; i<M; i++) {
			//Criando o 2º for para percorrer as Colunas(N) da matriz
			for(int j=0; j<N; j++) {//obs: utilizar outra letra pois o i ja está em uso
				mat[i][j] = sc.nextInt();//Leitura de cada elemento da matriz
			}
		}
		System.out.println();
		
		//Criando o for para Imprimir a matriz
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

}
