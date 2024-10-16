import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    //definir o tamanho do vetor//
	    int n = s.nextInt();
	    
	    //declarar o vetor, tamanho e alocar memória//
	    long numeros [] = new long[61];
	    numeros[0] = 0;
	    numeros[1] = 1;
	    
	    //armazenar os numeros digitados em cada índice do vetor//
	    for (int i=2; i<61; i++){
	        numeros[i] = numeros[i-2]+numeros[i-1];
	    }
	    
	    // a impressão ocorrerá em n vezes, conforme indicado
	    for (int i=0; i<n; i++){
	        int posicao = s.nextInt();
	        System.out.println("Fib(" + posicao + ") = " + numeros[posicao]);
	    }
	}
}
