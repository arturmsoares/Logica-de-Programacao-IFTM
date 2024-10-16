import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    double A, B, C, A2, BC, maior;
	    
	    A = s.nextDouble();
	    B = s.nextDouble();
	    C = s.nextDouble();
	    
	    
	    if(B > A && B > C){
	        maior = A;
	        A = B;
	        B = maior;
	    }else if (C > A){
	        maior = A;
	        A = C;
	        C = maior;
	    }
	    
	    A2 = Math.pow(A, 2);
	    BC = Math.pow(B, 2) + Math.pow(C, 2);

	    
	    
	    if (A >= B + C){
	        System.out.println("NAO FORMA TRIANGULO");
	    }else{
	        if (A2 > BC){
	            System.out.println("TRIANGULO OBTUSANGULO");
	        }else if (A2 < BC){
	            System.out.println("TRIANGULO ACUTANGULO");
	        }else{
	            System.out.println("TRIANGULO RETANGULO");
	        }
	    }
	    
	    if (A == B && B==C){
	        System.out.println("TRIANGULO EQUILATERO");
	    }else if (A == B || A==C || B==C){
	        System.out.println("TRIANGULO ISOSCELES");
	    }
	    
	    
	}
}