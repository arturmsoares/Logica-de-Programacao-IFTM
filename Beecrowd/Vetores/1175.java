import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);

	    
	    //declarar o vetor e alocar memória//
	    int numeros [] = new int[20];
	    
	    //armazenar os numeros digitados em cada índice do vetor//
	    for (int i=0; i<20; i++){
	        numeros[i] = s.nextInt();
	    }
	    
	    //Uma variável auxiliar é utilizada para trocar as posições
	    for (int i=0; i<10; i++){
	       // variável auxiliar é igual ao valor do indice 0. E assim sucessivamente
	        int numTrocado = numeros[i];
	        // valor do i=0 é assume o valor do indice 19-0. E assim sucessivamente
	        numeros[i] = numeros[19-i];
	        //Por fim, i=19-0 assume o valor de numTrocado. E assim sucessivamente
	        numeros[19-i]= numTrocado;
	    }
	    
	    for (int i=0; i<20; i++){
	        System.out.println("N[" + i + "] = " + numeros[i]);
	    }
	}
}