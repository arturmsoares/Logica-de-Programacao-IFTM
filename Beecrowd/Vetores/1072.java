import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    //indicar o tamanho do vetor//
	    int n = s.nextInt();
	    
	    //declarar vetor e alocar memória//
	    int numeros [] = new int[n];
	    
	    //cada numero digitado é armazenado no vetor//
	    for (int i=0; i<n; i++){
	        numeros[i] = s.nextInt();
	    }
	    
	    //declara e inicializa os contadores//
	    int contadorIn=0;
	    int contadorOut=0;
	    
	    //O numero armazenado em cada índice do vetor é analisado// 
	    for (int i=0;i<n;i++){
	        if (numeros[i]>=10 && numeros[i] <=20){
	            contadorIn++;
	        }
	        else{
	            contadorOut++;
	        }
	    }
	    
	    System.out.println(contadorIn + " in");
	    System.out.println(contadorOut + " out");
	}
}