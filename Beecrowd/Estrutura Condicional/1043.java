import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    float A = s.nextFloat();
	    float B = s.nextFloat();
	    float C = s.nextFloat();
	    float triangulo = A+B+C;
	    float trapezio = ((A+B)*C)/2;
	    
	    if((A<(B+C)) && (B<(A+  C)) && (C <(B+A))){
	       System.out.printf("Perimetro = %.1f\n", triangulo); 
	    }
	    else{
	        System.out.printf("Area = %.1f\n", trapezio);
	    }
	}
}
