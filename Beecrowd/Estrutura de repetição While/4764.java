/* Faça um programa em Java (utilizando while) para ler um número indeterminado de entrevistados. Para cada entrevistado será fornecido a idade, sexo e valor de salário. O programa deve calcular:

a média de salário do grupo;
maior e menor idade do grupo;
quantidade de mulheres com salário acima de R$ 3000,00.
Após a inclusão de cada funcionário, será informado a letra 's' para a inclusão de um novo funcionário ou letra 'n' para terminar a pesquisa.

Entrada
A entrada corresponde vários casos de teste. Cada caso contém um valor inteiro correspondente à idade, um caractere correspondente ao sexo('f' ou 'm'), um número real(double) correspondente ao salário e um caractere correspondente a continuidade ou termino da pesquisa. Caso esse último caractere tenha o valor 'n' o algoritmo irá terminar.



Saída
 Imprima uma linha contendo a média salarial do grupo, uma linha contendo a maior e menor idade do grupo e uma linha contendo a quantidade de mulheres com salário acima de 3000.00. Siga o formato dos exemplos abaixo.
 */
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    double salarioTotal = 0;
        int contadorTotal = 0;
        int menorIdade = Integer.MAX_VALUE;
        int maiorIdade = Integer.MIN_VALUE;
        int contadorM3 = 0;
        
        char continua = 's';
        
        while(continua=='s'){
            int idade = s.nextInt();
            char sexo = s.next().charAt(0);
            double salario = s.nextDouble();
            
            
            salarioTotal+=salario;
            contadorTotal++;

            
            if((sexo=='f') && (salario>3000)){
                contadorM3++;
            }
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            
            if (idade < menorIdade) {
                menorIdade = idade;
            }
            continua = s.next().charAt(0);
        }
        
        double media = salarioTotal/contadorTotal;
        
        System.out.printf("Media salarios = R$ %.2f%n", media);
	    System.out.println("Menor e maior idade = " + menorIdade + " e " + maiorIdade);
        System.out.println("Salarios de mulheres acima de R$ 3000.00 = " + contadorM3);
	}
}