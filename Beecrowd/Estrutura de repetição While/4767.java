/* Faça um programa em Java (utilizando while) que peça um número real(double) correspondente a uma nota, entre 0 e 10 ou entre 100 e 200, considerar os limites. Mostre a mensagem, "nota invalida", caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

Entrada
Vários números reais(double) fornecidos em sequencias, cada um representando uma possível nota.

Saída
Para cada nota imprima "nota invalida", se a nota não for válida ou imprima a própria nota, se válida, nesse caso finalize o programa.
 */
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    double nota;
	    
	    while(true){
	        
	        nota=s.nextDouble();
	        
	        if((nota>=0) && (nota<=10) || (nota>=100) && (nota <=200)){
	            
	        System.out.println(nota);
	        break;
	        }
	        else{
	            System.out.println("nota invalida");
	        }
	        
	        
	    }
	}
}