import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
	Scanner s = new Scanner (System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        
        if (a < b && a < c){
            System.out.println(a);
            if(b < c){
                System.out.println(b);
                System.out.println(c);
            }else{
                System.out.println(c);
                System.out.println(b);
            }
                
        }
        else if (b < c){
                System.out.println(b);
                if(a < c){
                    System.out.println(a);
                    System.out.println(c);
                }else{
                    System.out.println(c);
                    System.out.println(a);
                }
        }else{
            System.out.println(c);
            if(b < a){
                System.out.println(b);
                System.out.println(a);
            }else{
                System.out.println(a);
                System.out.println(b);
            }
        }
        
        System.out.println("");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
            
  }
}