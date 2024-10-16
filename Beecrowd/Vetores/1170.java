import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    //definir o tamanho do vetor//
	    int n = s.nextInt();
	    
	    //declarar o vetor, tamanho e alocar memória//
	    float comida [] = new float[n];
	    
	    //armazenar os numeros digitados em cada índice do vetor//
	    for (int i=0; i<n; i++){
	        comida[i] = s.nextFloat();
	    }
	    
	    //processamento para cada caso
	    for(int i=0; i<n;i++){
	        //comida disponível inicial é igual ao valor armazenado no vetor comida
	        float qtdeComida = comida[i];
	        //inicializa variável dias
	        int dias = 0;
	        
	        while(qtdeComida>1.0){
	            //qtde comida é igual a sua divisão por 2
	            qtdeComida/=2;
	            dias ++;
	            
	        }
	        
	        System.out.println(dias + " dias");
	    }
	    
	}
}