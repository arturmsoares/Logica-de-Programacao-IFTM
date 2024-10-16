/* Faça um programa em Java para ler uma quantidade indeterminada de números reais, até a digitação de um número negativo. O programa deverá apresentar a soma desses números, bem como a quantidade de números informados. Não considerar o número negativo no cálculo, ele apenas indica ao programa a necessidade de terminar a execução.



Entrada
A entrada conterá vários números reais.



Saída
Imprima a soma e a quantidade de números informados.
 */
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    float numero;
	    float soma=0;
	    int quantidade=0;
	    
	    while((numero=s.nextFloat())>=0){
	        soma+=numero;
	        quantidade++;
	        
	    }
	    
	    System.out.printf("Soma = %.2f\n" ,  soma);
	    System.out.println("Quantidade = " + quantidade);

	}
}