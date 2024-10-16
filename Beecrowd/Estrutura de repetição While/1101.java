import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    int M, N, soma, menor, maior;
	    
	    
	    while( ((M = s.nextInt())>0 && (N = s.nextInt())>0)){
	        soma=0;
	        /**É necessário colocar o "soma=0" dentro do While para em cada caso de repetição assumir o valor 0**/
	        if(M>=N){
	            menor=N;
	            maior=M;
	        }else{
	            menor=M;
	            maior=N;
	        }
	        
	        for(int i=menor; i<=maior;i++){
	            System.out.printf(i + " ");
	            soma+=i;
	        }
	            System.out.println("Sum=" + soma);
	        
	    }
	    
	}
}

