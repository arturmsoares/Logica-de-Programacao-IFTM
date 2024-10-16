/* Faça um programa em Java que leia uma nota e então calcule a porcentagem(X) dessa nota sobre o valor total da prova. Caso a nota informada seja um valor menor que 0 ou maior que 22 imprima "Nota invalida."

Fórmula para calcular porcentagem :
X = (nota*100)/22;

Entrada
Leia um número real(double) que corresponde a nota.

Saída
Imprima "Eu espero tirar X% da nota.". Onde X é o valor calculado pelo seu algoritmo. Caso a nota seja um valor menor que 0 ou maior que 22 imprima "Nota invalida."
 */
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
        double nota = s.nextDouble();
        double porcentagem = (nota*100)/22;
        
        if (nota >22 || nota < 0){
            System.out.println("Nota invalida.");
        }else{
            System.out.println(String.format("Eu espero tirar %.2f%% da nota.", porcentagem));
        }


	}
}

