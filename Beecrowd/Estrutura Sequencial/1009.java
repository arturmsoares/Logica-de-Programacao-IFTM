import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        
        
        String vendedor = s.nextLine();
        double salario = s.nextDouble();
        double vendas = s.nextDouble();
        
        
        double bonus = (vendas * 0.15);
        double salariofinal = (salario + bonus);
        
    
        System.out.println(String.format("TOTAL = R$ %.2f" , salariofinal));
	}
}