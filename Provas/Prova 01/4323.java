/* Faça um programa em Java que tem como entrada um valor em metros e imprima na tela o valor correspondente em centímetros, milímetros, quilômetro e milha. Como calcular:

Centímetro : multiplique o valor em metros por 100.
Milímetro : multiplique o valor em metros por 1000.
Quilômetro : divida o valor de comprimento por 1000.00.
Milha : para um resultado aproximado, divida o valor de comprimento por 1609.00.
Obs.: Passar nos testes não significa estar correto, os testes não são completos.



Entrada
Um número inteiro contendo o valor em metros.



Saída
Imprimir os valores conforme exemplos abaixo. Quilômetro e Milha precisam de precisão de 4 casas decimais após o ponto (Utilize o System.out.printf).
 */


import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    int metro = s.nextInt();
	    int centimetro = metro * 100;
	    int milimetro = metro * 1000;
	    double quilometro = metro/1000.00;
	    double milha = metro / 1609.00;
	   
	    
	    System.out.printf(metro + " metros\n");
	    System.out.printf(centimetro + " centímetros\n");
	    System.out.printf(milimetro + " milímetros\n");
	    System.out.printf("%.4f quilômetros\n", quilometro);
	    System.out.printf("%.4f milhas\n", milha);
	    


	}
}
