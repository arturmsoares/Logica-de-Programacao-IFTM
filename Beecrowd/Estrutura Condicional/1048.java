import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
	Scanner s = new Scanner (System.in);
	
	double salario = s.nextDouble();
	double reajuste;
	double novoSalario;
	int percent;
	
	if(salario <= 400.00){
	    reajuste = salario * 0.15;
	    novoSalario = salario + reajuste;
	    percent = 15;
	    
	}else if(salario > 400.00 && salario <= 800.00){
	    reajuste = salario * 0.12;
	    novoSalario = salario + reajuste;
	    percent = 12;
	    
	}else if(salario > 800.00 && salario <= 1200.00){
	    reajuste = salario * 0.10;
	    novoSalario = salario + reajuste;
	    percent = 10;
	    
	}else if(salario > 1200.00 && salario <= 2000.00){
	    reajuste = salario * 0.07;
	    novoSalario = salario + reajuste;
	    percent = 7;
	    
	}else{
	    reajuste = salario * 0.04;
	    novoSalario = salario + reajuste;
	    percent = 4;
	}
	
	System.out.printf("Novo salario: %.2f\n", novoSalario);
	System.out.printf("Reajuste ganho: %.2f\n", reajuste);
	System.out.println("Em percentual: " + percent + " %");
	

  }
}