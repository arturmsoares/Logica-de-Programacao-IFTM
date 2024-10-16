import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
        int entrada;
        int contador=1;
        int maior=0;
        
        for( int i=1; i<=100; i++){
            entrada = s.nextInt();
            if(i==1){
                maior=entrada;
                contador=1;
            }
            else if(entrada > maior){
                maior = entrada;
                contador = i;
            }
        }
        System.out.println(maior);
        System.out.println(contador);
	}    
}
 