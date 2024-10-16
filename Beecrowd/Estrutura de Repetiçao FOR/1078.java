import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
        int n = s.nextInt();
        int tab;
    
        for(int i=1; i <=10; i++){
            tab = i*n;
            System.out.println(i + " x " + n + " = " + tab);
        }
	}    
}
 