/* Faça um programa em java que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela:

- a quantidade de números pares

- todos os números pares

Entrada
Ler um número inteiro(n), depois n números inteiros.

Saída
Imprima a quantidade de números pares informado, bem como todos os números pares do vetor.
 */

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		//definir o tamanho do vetor//
		int n = s.nextInt();
		int contador = 0;


		//declarar o vetor//
		int vetor [] = new int[n];

		for (int i=0; i<n; i++) {
			vetor[i] = s.nextInt();
		}

		for (int i=0; i<n; i++) {
			if (vetor[i]%2==0) {
				contador++;
			}
		}
		
		System.out.println(contador);
		System.out.printf("{");

		for (int i=0; i<n-1; i++) {
			if (vetor[i]%2==0) {
				System.out.print(vetor[i] + ";");
			}
		}
		
		for (int i=n-1; i<n; i++) {
			if (vetor[i]%2==0) {
				System.out.print(vetor[i]);
			}
		}
		
		System.out.println("}");
	}
}