import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
	Scanner s = new Scanner (System.in);

	int cod = s.nextInt ();
	int quantidade = s.nextInt ();
	double total;

	if (cod == 1)
	  {
		total = quantidade * 4.00;
		System.out.println ("Total: R$ " + String.format ("%.2f", total));
	  }
	else if (cod == 2)
	  {
		total = quantidade * 4.50;
		System.out.println ("Total: R$ " + String.format ("%.2f", total));
	  }
	else if (cod == 3)
	  {
		total = quantidade * 5.00;
		System.out.println ("Total: R$ " + String.format ("%.2f", total));
	  }
	else if (cod == 4)
	  {
		total = quantidade * 2.00;
		System.out.println ("Total: R$ " + String.format ("%.2f", total));
	  }
	else
	  {
		total = quantidade * 1.50;
		System.out.println ("Total: R$ " + String.format ("%.2f", total));
	  }
  }
}