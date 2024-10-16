/* Faça um programa em Java que valide o ano de nascimento informado pelo usuário. Um ano de nascimento precisa ser um valor entre 1900 e 2023, considerando os limites, ou seja, os valores 1900 e 2023. O programa deve receber quantos números forem necessários, quando o número for inválido imprima "Ano invalido", quando o ano for valido, imprima o ano e finalize o programa.



Entrada
Vários números inteiros fornecidos em sequencias, cada um representando uma possível data. Parar quando a data for válida.



Saída
Para cada número imprima "Ano invalido", se o número não for ano válido ou imprima o próprio número, se o ano for válido, nesse caso finalize o programa.
 */

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    int ano;
	    
	    while (true) {
	        ano=s.nextInt();
	        
	        if(ano >= 1900 && ano <=2023){
	           System.out.println(ano);
	            break; 
	        }
	        else{
	            System.out.println("Ano invalido");
	        }
	    } 
	}
}
