import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    //definir o tamanho do vetor//
	    int n = s.nextInt();
	    int menor = Integer.MAX_VALUE;
	    int posicao = 0;
	    
	    //declarar vetor e seu tamanho//
	    int vetor [] = new int[n];
	    
	    for(int i=0; i<n; i++){
	        vetor[i]=s.nextInt();
	        
	        if(vetor[i]<menor){
	            menor=vetor[i];
	            posicao = i;
	        }
	    }
	    
	    System.out.println("Menor valor: " + menor);
	    System.out.println("Posicao: " + posicao);
	    
	}
}
