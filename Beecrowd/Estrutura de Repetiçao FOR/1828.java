import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    int teste = s.nextInt();
	    s.nextLine();
	    
	    for(int i=1; i<=teste;i++){
	        String[] jogada = s.nextLine().split(" ");
	        String sheldon = jogada[0];
	        String raj = jogada[1];
	        String fala;
	        
	        if(sheldon.equals(raj)){
	            fala= "De novo!";
	        }
	        else if(
    	            (sheldon.equals("tesoura") && (raj.equals("papel") || raj.equals("lagarto"))) ||
    	            (sheldon.equals("papel") && (raj.equals("pedra") || raj.equals("Spock"))) ||
    	            (sheldon.equals("pedra") && (raj.equals("lagarto") || raj.equals("tesoura"))) ||
    	            (sheldon.equals("lagarto") && (raj.equals("Spock") || raj.equals("papel"))) ||   
    	            (sheldon.equals("Spock") && (raj.equals("tesoura") || raj.equals("pedra")))
	               )
    	            {
    	            fala="Bazinga!";
    	            }
	        else{
	            fala="Raj trapaceou!";
	        }
	        
	        System.out.println("Caso #" + i + ": " + fala);
	    }
	}
}