import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);

	    double numeros [] = new double[100];
	    numeros[0] = s.nextDouble();

	    //armazenar os numeros digitados em cada índice do vetor//
	    for (int i=1; i<100; i++){
	        numeros[i] = numeros[i-1]/2;
	    }
	    
	    for (int i=0; i <100; i++){
	        System.out.printf("N[%d] = %.4f\n", i, numeros[i]);
	    }
	    
	}
}

