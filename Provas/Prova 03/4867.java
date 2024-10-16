/* Implemente um programa em Java que solicite ao usuário a entrada de números inteiros positivos e calcule:

a média desses números
quantidade de números pares
quantidade de números impares. 
O programa deve continuar solicitando números até que a soma de todos os números inseridos seja maior ou igual a um valor-alvo definido pelo usuário. O último número inserido deve ser considerado nos cálculos.



Descrição:
O programa deve solicitar ao usuário para definir um valor-alvo (um número inteiro positivo).
O programa deve utilizar uma estrutura while para continuar solicitando números até que a soma de todos os números inseridos seja maior ou igual ao valor-alvo.
O programa deve calcular a média dos números inseridos e contar a quantidade de números pares e impares.
O programa deve exibir a quantidade de números pares, impares e a média  desses números.


Entrada
Um número inteiro que representa o valor-alvo que limita a soma dos números e vários números inteiros.



Saída
Imprimir a quantidade de números pares, impares e a média desses números, com duas casas decimais.
 */
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    int alvo = s.nextInt();
	    int numero;
	    double soma=0;
	    int numPar=0;
	    int numImpar=0;
	    
	    
	    while(soma<alvo){
	        numero=s.nextInt();
	        soma+=numero;
	        
	        if(numero%2==0){
	            numPar++;
	        }
	        else{
	            numImpar++;
	        }
	    }
	    
	    double media=soma/(numPar + numImpar);
	    
	    System.out.println("Pares = " + numPar);
	    System.out.println("Impares = " + numImpar);
	    System.out.printf("Média = %.2f\n" , media);
	    
	}
	
}
