import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    int X, Y;
	    
	    do{
	        X=s.nextInt();
	        Y=s.nextInt();
	        
	        if(X>0 && Y>0){
	          System.out.println("primeiro");  
	        }
	        else if(X<0 && Y>0){
	           System.out.println("segundo"); 
	        }
	        else if(X<0 && Y<0){
	            System.out.println("terceiro");
	        }else if(X>0 && Y<0){
	            System.out.println("quarto");
	        }
	    }
	    while(X != 0 && Y!=0);   
	}
}
