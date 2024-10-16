/* Faça um programa em java que leia N números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos, na ordem do último (posição N-1) ao primeiro (posição 0).

Obrigatório o uso de vetores.

Entrada
Ler um número inteiro(n) e depois n números inteiros.

Saída
Imprima os números negativos lidos, na ordem do último ao primeiro.
 */

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		//definir o tamanho do vetor//
		int n = s.nextInt();

		//declarar o vetor//
		int vetor[] = new int[n];


		for (int i=0; i<n; i++) {
			vetor[i] = s.nextInt();
		}

		for (int i=n-1; i>=0; i--) {

			if(vetor[i]<0) {
				System.out.println(vetor[i]);
			}
		}
	}
}
