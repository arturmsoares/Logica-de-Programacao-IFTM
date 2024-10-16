import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    
	    int T = s.nextInt();
	    int PA, PB; 
	    double G1, G2;
	    
	    
	    for(int i=1; i<=T; i++){
	        
	        int anos = 0;
	        PA=s.nextInt();
	        PB=s.nextInt();
	        G1=s.nextDouble();
	        G2=s.nextDouble();
	        
    	        while (PB>=PA){
    	            PA+=(PA*G1)/100;
    	            PB+=(PB*G2)/100;
    	            anos++;
    	            
    	            if(anos>100){
    	                break;
    	            }
    	        }
    	        
    	        if(anos>100){
    	            System.out.println("Mais de 1 seculo.");
    	        }
    	        else{
    	            System.out.println(anos + " anos.");
    	        }
	    }
	    
	}
}