import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    int X, Y;
	    
	    while((X=s.nextInt())!=(Y=s.nextInt())){
	        
	        if(X<Y){
	            System.out.println("Crescente");
	        }
	        else{
	            System.out.println("Decrescente");
	        }
	    }
	}
}

