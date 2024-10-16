import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    //declaro a o valor inicial a ser digitado
        int entrada=s.nextInt();
	    
	    //declarar o vetor e alocar memória
	    int numero [] = new int[10];
	    
	    //indicar o valor que ocupa a posição 0 do vetor
	    numero [0] = entrada;
	    
	    //indicar que da posição 1 a 9 o valor armazenado será: o valor da posição anterior*2
	    for (int i=1; i<10; i++){
	        numero[i]=numero[i-1] * 2;
	    }
	    
	    for (int i=0;i<10;i++){
	        System.out.println("N[" + i + "] = " + numero[i]);
	    }
	}
}