import java.util.Scanner;

public class 1049

{
  public static void main (String[]args)
  {
	Scanner s = new Scanner (System.in);
	
	float N1 = s.nextFloat ();
	float N2 = s.nextFloat ();
	float N3 = s.nextFloat ();
	float N4 = s.nextFloat ();

	float media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;
	
	if (media >= 7.0)
	  {
	    System.out.printf ("Media: %.1f\n", media);
		System.out.println ("Aluno aprovado.");
	  }

	else if (media < 5.0)
	  {
	    System.out.printf ("Media: %.1f\n", media);
		System.out.println ("Aluno reprovado.");
	  }

	else{
	    System.out.printf ("Media: %.1f\n", media);
    	System.out.println ("Aluno em exame.");
    	float N5 = s.nextFloat ();
    	System.out.printf("Nota do exame: %.1f\n", N5);
    	float mediaFinal = (media + N5) / 2;
    
    	if (mediaFinal >= 5.0)
    	{
    	System.out.println ("Aluno aprovado.");
    	System.out.printf ("Media final: %.1f\n", mediaFinal);
    	}
    	
    	else{
    	System.out.println ("Aluno reprovado.");
    	}
	}
  }
}