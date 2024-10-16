import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    //definir o tamanho do vetor//
	    //int n = s.nextInt();
	    
	    //declarar o vetor e alocar memória - Nesse caso indico que o vetor tem 10 posições//
	    int numeros [] = new int[10];
	    
	    //armazenar os numeros digitados em cada índice do vetor//
	    for (int i=0; i<10; i++){
	        numeros[i] = s.nextInt();
	    }
	   
	    //Um segundo "for" repassa em cada índice do vetor, armazenando o 1 conforme condição//
	    for (int i=0; i<10; i++){
	        if (numeros[i]<=0){
	        numeros[i]=1;
	        }
	            System.out.println("X["+ i +"]" + " = " +numeros[i]);
	   }
	}
}

