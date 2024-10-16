import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int contador = 0;
		//definir o tamanho do vetor//
		int n = s.nextInt();

		//declarar vetor e seu tamanho=n//
		int vetor [] = new int[n];


		for(int i=0; i<n; i++) {
			vetor[i]= s.nextInt();

		}
        
        //percorrendo numeros de 1 a 2000 iniciando um contador igual a 0
        
		for(int i=1; i<=2000; i++) {
			contador = 0;
			
			//para cada numero do intervalo acima, faço a comparação com o valor armazenado no vetor, na posição igual a "j"
			//posição j varia de 0 a <n
			//caso o i seja igual ao valor armazenado na posição j do vetor,o contador é incrementado.
			
			for (int j=0; j<n; j++) {
				if (i == vetor[j]) {
				    contador++;
				}
			}
			
			//só haverá impressão APÓS o lanço de repetição nas interações em que houve o incremento do contador
			if (contador > 0) {
				System.out.println(i + " aparece " + contador + " vez(es)");
			}
		}
	}
}
