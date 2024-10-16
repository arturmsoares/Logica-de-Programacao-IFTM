import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    int X = s.nextInt();
	    int Y = s.nextInt();
	    int soma = 0;
	    int partida = 0;
	    int fim = 0;
	    
	    
	    if (Y<X){
	        partida = Y;
	        fim = X;
	    }
	    else {
	        partida = X;
	        fim = Y;
	    }
	    
	    for (int i=(partida+1); i< fim; i++){
	        if (i % 2 !=0){
	        soma+=i;    
	        }
	    }
	    
	    System.out.println(soma);
	}
}

