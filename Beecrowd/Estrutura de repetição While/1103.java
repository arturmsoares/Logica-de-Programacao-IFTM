import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    int teste=1;
	    
	    while(teste!=0){
	      
	        int h1=s.nextInt();
	        int m1=s.nextInt();
	        int h2=s.nextInt();
	        int m2=s.nextInt();
	        
	        if (h1==0 && m1==0 && h2==0 && m2==0){
	            teste=0;
	        }
	        else{
	            int minTotal1=(h1*60)+m1;
	            int minTotal2=(h2*60)+m2;
	            int resposta=0;
	            
	            if(minTotal2<minTotal1){
	                h2=(24*60)+minTotal2;
	                resposta=h2-minTotal1;
	                System.out.println(resposta);
	            }
	            else{
	                resposta=minTotal2-minTotal1;
	                System.out.println(resposta);
	            }
	       
	        }

	    }
	}
}