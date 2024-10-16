import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    int cod1 = s.nextInt();
	    int quant1 = s.nextInt();
	    double valor1 = s.nextDouble();
	    
	    int cod2 = s.nextInt();
	    int quant2 = s.nextInt();
	    double valor2 = s.nextDouble();
	    
	    double valorTotal = (quant1 * valor1)+(quant2 * valor2);
	    
	    System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
	    
	    
	}
}
