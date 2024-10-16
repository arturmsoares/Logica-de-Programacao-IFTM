/* Faça uma função que recebe por parâmetro o raio de uma esfera e calcula o seu volume , onde  = 3.1416. Faça o programa que utilize a função, ele deverá receber o raio da esfera, utilizar a função e retornar a resposta, conforme a tabela acima.

(Obrigatório a utilização de funções)



Entrada
Um número real correspondente ao raio de uma esfera.



Saída
Uma linha apresentando o volume da esfera, conforme exemplo abaixo.
 */
import java.util.Scanner;

public class Main
{
	public static void main (String[]args)
	{
		Scanner s = new Scanner (System.in);
        
        double raio = s.nextDouble();
		double resultado = volumeEsfera(raio);
		
		System.out.printf("Volume : %.2f\n", resultado);
		
		s.close();
	}
	
	static double volumeEsfera(double raio){
	    double volume = (4*3.1416*(raio*raio*raio))/3;
	    return volume;
	}

}
