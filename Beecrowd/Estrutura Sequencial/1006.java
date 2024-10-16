import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        
        a=2*a;
        b=3*b;
        c=5*c;
        
        double media = (a+b+c)/10;
        System.out.printf("MEDIA = %.1f\n" , media);
	}
}