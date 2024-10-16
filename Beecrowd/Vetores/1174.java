import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    //definir o tamanho do vetor//
	    //int n = s.nextInt();
	    
	    //declarar o vetor, tamanho e alocar memória//
	    double numeros [] = new double[100];
	    
	    //armazenar os numeros digitados em cada índice do vetor//
	    for (int i=0; i<100; i++){
	        numeros[i] = s.nextDouble();
	    }
	    
	    for(int i=0; i<100; i++){
	        
	        if(numeros[i]<=10){
	          System.out.printf("A[%d] = %.1f%n", i, numeros[i]);
	        }
	    }
	}
}

