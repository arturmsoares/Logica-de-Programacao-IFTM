import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
        int numero= s.nextInt();
        int teste;
        
        for ( int i=0; i< numero; i++){
            teste = s.nextInt();
            if (teste==0){
                System.out.println("NULL");
            }
            else{
                if (teste%2==0){
                    System.out.print("EVEN ");
                }
                else{
                    System.out.print("ODD ");
                }
                if (teste >0){
                    System.out.println("POSITIVE");
                }
                else{
                    System.out.println("NEGATIVE");
                }
            }
            
        }
        
    }
}