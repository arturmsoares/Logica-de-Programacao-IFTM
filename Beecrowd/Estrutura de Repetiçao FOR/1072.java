import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
        int numero = s.nextInt();
        int contador1= 0;
        int contador2= 0;
        
        
        for (int i=0;i< numero;i++){
            int teste = s.nextInt();
            if(teste>=10 && teste <= 20){
             contador1++;
            }
            else{
             contador2++;
            }
            
        }
        
             System.out.println(contador1 + " in");
             System.out.println(contador2 + " out");
    }

}