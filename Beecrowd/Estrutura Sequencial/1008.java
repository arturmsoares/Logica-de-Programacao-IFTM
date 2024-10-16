import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        
        
        int funcionarios = s.nextInt();
        int horas = s.nextInt();
        double valorporhora = s.nextDouble();
        
        
        double salario = (horas * valorporhora);
        
        System.out.println("NUMBER = " + funcionarios);
        System.out.println(String.format("SALARY = U$ %.2f" , salario));
	}
}