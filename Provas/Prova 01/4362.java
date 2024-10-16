/* Fazer um programa para ler um número real(double) é verificar se ele é valido ou não. Um número é válido se estiver entre 0.0 e 200.0, considerar 0 e 200.



Entrada
A entrada contém um número real(double).



Saída
Imprima "Valido" ou "Invalido"
 */
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
        double numero = s.nextDouble();
        
        if (numero <= 200 && numero>= 0){
            System.out.println("Valido");
        }else{
            System.out.println("Invalido");
        }
	    


	}
}

