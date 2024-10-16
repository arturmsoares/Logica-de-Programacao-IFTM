/* Faça um programa em Java que determinará se um aluno tem direito a uma bolsa de estudo. O programa deverá receber três valores, a nota, as faltas e a renda do aluno. Para receber a bolsa de estudos, o aluno precisará atender as seguintes condições:

- Ter nota igual ou superior a 8.0, ter faltas igual ou inferior a 10 e ter renda menor do que R$ 2000.00.

ou

- Ter nota igual ou superior a 9.5 e faltas igual a 0.

Entrada
Um número real(double), que corresponde a nota do aluno, um número inteiro, que corresponde as faltas, e um número real(double), que corresponde a renda do aluno.

Saída
Imprimir "Pode receber bolsa" ou "Não pode receber bolsa", dependendo dos valores informados.
 */


import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
        double nota = s.nextDouble();
        int faltas = s.nextInt();
        double renda = s.nextDouble();
        
        if ((nota >= 8.0 && faltas <=10 && renda < 2000.00) || (nota >=9.5 && faltas == 0)){
            System.out.println("Pode receber bolsa");
        }else{
            System.out.println("Não pode receber bolsa");
        }

	}
}