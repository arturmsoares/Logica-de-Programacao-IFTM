import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    int distancia = s.nextInt();
	    double combustivel = s.nextDouble();
	    double consumo = distancia / combustivel;
	    
	    System.out.println(String.format("%.3f km/l", consumo));
	}
}
