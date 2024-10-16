import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        
        double a = s.nextDouble();
        double b = s.nextDouble();
        
        a=3.5*a;
        b=7.5*b;
        
        double media = (a+b)/11;
        System.out.printf("MEDIA = %.5f\n" , media);
	}
}