import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
	Scanner s = new Scanner (System.in);
	
    int hi = s.nextInt();
    int hf = s.nextInt();
    
    if(hi>hf){
    System.out.println("O JOGO DUROU " +(24-(hi-hf)) + " HORA(S)");
    
    }else if(hf>hi){
    System.out.println("O JOGO DUROU " +(hf-hi) + " HORA(S)");
    
    }else{System.out.println("O JOGO DUROU 24 HORA(S)");
    }
  }
}