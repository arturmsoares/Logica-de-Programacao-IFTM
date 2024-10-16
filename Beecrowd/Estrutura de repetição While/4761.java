/* Faça um programa em Java para ler um número indeterminado de votos, contendo cada um, o número do candidato. O último dado, que não entrará nos cálculos, contém um valor negativo. Computar os votos da eleição. As opções de voto são:



1. Candidato 1;

2. Candidato 2;

3. Candidato 3;

4. Voto Nulo;

5. Voto em branco.



Ao final, imprimir a quantidade de votos de cada candidato bem como o número de votos em branco e nulo.



obs: considere que só serão entrado dados negativos ou entre 1 e 5. 

Entrada
A entrada conterá vários números inteiros. Caso o valor informado seja menor que zero, o programa deve parar. 



Saída
Imprima a quantidade de votos de cada candidato bem como o número de votos em branco e nulo.
 */


import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    int voto;
	    int contador1=0;
	    int contador2=0;
	    int contador3=0;
	    int contador4=0;
	    int contador5=0;
	    
	    while((voto = s.nextInt())>=1){
	        if(voto==1){
	            contador1++;
	        }
	        else if(voto==2){
	            contador2++;
	        }
	        else if(voto==3){
	            contador3++;
	        }
	        else if(voto==4){
	            contador4++;
	        }
	        else if(voto==5){
	            contador5++;
	        }
	    }
	    System.out.println("Candidato 1 : " + contador1 +" voto(s)");
	    System.out.println("Candidato 2 : " + contador2 +" voto(s)");
	    System.out.println("Candidato 3 : " + contador3 +" voto(s)");
	    System.out.println("Nulos : " + contador4 +" voto(s)");
	    System.out.println("Brancos : " + contador5 +" voto(s)");
	}
}
