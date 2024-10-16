/* Faça um programa em Java para ler e preencher dois vetores de inteiros com N posições. Em seguida gere um novo vetor, no qual cada posição conterá o resultado da multiplicação dos números presentes nos dois vetores originais na mesma posição.

Entrada
Ler um número inteiro N e então preencher dois vetores com N números inteiros cada um.

Saída
Imprima o novo vetor conforme exemplo, onde cada posição i corresponde ao produto dos números contidos nos dois vetores na mesma posição i.
 */

 
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    //definir o tamanho do vetor//
	    int n = s.nextInt();
	    
	    //declarar o vetor//
	    int vetor1 [] = new int[n];
	    int vetor2 [] = new int [n];
	    int vetorProduto [] = new int [n];
	    
	    
	    for (int i=0; i<n; i++){
	        vetor1[i] = s.nextInt();
	    }
	    
	    for (int i=0; i<n; i++){
	        vetor2[i] = s.nextInt();
	    }
        
        for (int i=0; i<n; i++){
            vetorProduto[i]=vetor1[i]*vetor2[i];
        }
        
        System.out.print("{" + vetorProduto[0]);
        
        for (int i=1; i<n; i++){
            System.out.print("," + vetorProduto[i]);
        }
        System.out.println("}");
	}
}