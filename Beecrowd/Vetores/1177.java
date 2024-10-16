import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		//declaro a o valor inicial a ser digitado
		int entrada=s.nextInt();

		//declarar o vetor e alocar memC3ria
		int numero [] = new int[1000];

		//Preenchimento do vetor: resta da divisão de i pela entrada garante que os valores se repitam entre 0 e entrada-1.
		for (int i=1; i<1000; i++) {
			numero[i]=i % entrada;
		}

		for (int i=0; i<1000; i++) {
			System.out.println("N[" + i + "] = " + numero[i]);
		}
	}
}
