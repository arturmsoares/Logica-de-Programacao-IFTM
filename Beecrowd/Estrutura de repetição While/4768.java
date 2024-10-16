/* Faça um programa em Java(utilizando while) para ler um número indeterminado de salários de entrevistados. Para cada entrevistado será fornecido apenas o salário. O programa deve calcular a média dos salários informados. Caso o salário informado tenha um valor negativo ou superior a 100000, o salário não será considerado e o programa finalizará.

Entrada
A entrada corresponde vários casos de teste. Cada caso contém um valor double correspondente ao salário.

obs.: considere que teremos no mínimo um salário válido. Assim evitamos o problema da divisão por zero.

Saída
Imprima uma linha contendo a média salarial, no formato "R$ valor média salários"
 */
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    double salario;
	    float soma=0;
	    float media=0;
	    int contador=0;
	    
	    while(true){
	        
	        salario=s.nextDouble();
	        
	        if((salario>=0) && (salario<=100000)){
	        soma+=salario;
	        contador++;
	        media=soma/contador;   
	        }
	        else{
	            break;
	        }
	    }
	    System.out.printf("R$ %.2f\n", media);
	}
}
