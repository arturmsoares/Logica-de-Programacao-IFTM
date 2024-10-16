import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int par [] = new int [5];
		int impar [] = new int [5];
		int indicePar = 0;
		int indiceImpar = 0;


		//Ler os 15 numeros//
		for (int i=0; i<15; i++) {
			int num = s.nextInt();

			if (num % 2==0) {
				//numero par?
				par[indicePar]=num;
				indicePar++;

				if (indicePar==5) {
					for(int j=0; j<5; j++) {
						System.out.println("par[" + j + "] = " + par[j]);
					}
					indicePar=0;
				}
			}
			else {
				impar[indiceImpar]=num;
				indiceImpar++;

				if (indiceImpar==5) {
					for (int j=0; j<5; j++) {
						System.out.println("impar[" + j + "] = " + impar[j]);
					}
					indiceImpar=0;
				}
			}
		}
		for (int j = 0; j < indiceImpar; j++){
		    System.out.println("impar[" + j + "] = " + impar[j]);
		}
		
		for (int j = 0; j < indicePar; j++){
		    System.out.println("par[" + j + "] = " + par[j]);
		}
	}
}
