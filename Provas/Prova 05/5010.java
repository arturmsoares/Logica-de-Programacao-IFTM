/* Faça uma função que recebe, por parâmetro, a altura (double) e o sexo (char) de uma pessoa e retorna o seu peso ideal. Para homens, o cálculo do peso ideal utiliza a fórmula : peso ideal = (72.7 x altura) - 58 e, para mulheres, peso ideal = (62.1 x altura) - 44.7.

Faça o programa que utilize a função, ele deverá receber a altura e o peso, utilizar a função e retornar a resposta, conforme a tabela acima.

(Obrigatório a utilização de funções)



dica : comando para ler um char : s.next().charAt(0);



Entrada
Um número real que correspondente a altura e um caractere que representa o sexo de uma pessoa.



Saída
Uma linha apresentando o peso ideal, conforme exemplo abaixo
 */
import java.util.Scanner;

public class Main
{
	public static void main (String[]args)
	{
		Scanner s = new Scanner (System.in);
        
        double altura = s.nextDouble();
        char sexo = s.next().charAt(0);
		
		double resposta = pesoIdeal(altura, sexo);
		
		System.out.printf("%.2f\n", resposta);
		
		s.close();
	}
	
	static double pesoIdeal(double altura, char sexo){
	    double peso=0;
	    if (sexo == 'M'){
	        peso = (72.7 * altura) - 58;
	    }
	    else if (sexo =='F'){
	        peso = (62.1 * altura) - 44.7;
	    }
	    else{
	        System.out.println("Caractere Invalido");
	    }
	    return peso;
	}

}