import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
        int numero = s.nextInt();
        
        
        for (int i=1;i <= numero;i++){
            if(i%2==0){
                System.out.println(i + "^2 = " + (i*i));
            }
            
        }

    }
}