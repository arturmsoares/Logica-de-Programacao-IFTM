import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Informe a quantidade de clientes: ");

		int qtde= s.nextInt();
		s.nextLine();

		String nome [] = new String[qtde];
		String  telefone[] = new String[qtde];
		int tipo [] = new int[qtde];
		int minutos [] = new int[qtde];
		double valorDaConta []= new double[qtde];
		double valorExtra=0;
		int minutosExtra=0;
		double receitaTotal = 0;
		double menorConta = Double.MAX_VALUE;
		int minutosTotais = 0;
		int consumoMedio = 0;
		int contadorTipo1 = 0;
		int contadorTipo2 = 0;
		double porcentagemTipo2 = 0;
		double precos [][] = new double[3][2];

		for (int i=0; i< qtde; i++) {
			System.out.println("Cliente " + (i + 1) + ":");
			System.out.print("Nome: ");
			nome[i] = s.nextLine();
			System.out.print("Telefone: ");
			telefone [i] = s.nextLine();
			System.out.print("Tipo de assinatura: ");
			tipo[i] = s.nextInt();
			System.out.print("Minutos consumidos: ");
			minutos[i] = s.nextInt();

			s.nextLine();
		}

		System.out.println("Informe o preço basico e excendente de cada tipo de conta:");
		for(int i = 0; i < 3; i++){
				System.out.printf("Tipo " + i + ": ");
				precos[i][0] = s.nextDouble();
				precos[i][1] = s.nextDouble();
				s.nextLine();
			}


		for (int i=0; i < qtde; i++) {
			if (minutos[i]<=90 && tipo[i]==0) {
				valorDaConta[i]=precos[0][0];
			}
			else if (minutos[i]<=90 && tipo[i]==1) {
				valorDaConta[i]=precos[1][0];
			}
			else if (minutos[i]<=90 && tipo[i]==2) {
				valorDaConta[i]=precos[2][0];
			}

			else {
				if (tipo[i]==0) {
					minutosExtra=minutos[i]-90;
					valorExtra=precos[0][1] * minutosExtra;
					valorDaConta[i]=valorExtra + precos[0][0];
				}
				else if (tipo[i]==1) {
					minutosExtra=minutos[i]-90;
					valorExtra=precos[1][1] * minutosExtra;
					valorDaConta[i]=valorExtra + precos[1][0];
				}
				if (tipo[i]==2) {
					minutosExtra=minutos[i]-90;
					valorExtra=precos[2][1] * minutosExtra;
					valorDaConta[i]=valorExtra + precos[2][0];
				}
			}
		}
		
		for(int i = 0; i < qtde; i++){
		    receitaTotal+=valorDaConta[i];
		}

		for(int i = 0; i < qtde; i++){
			if(tipo[i]== 1){
				minutosTotais+=minutos[i];
				contadorTipo1++;
			}
			if(tipo[i]== 2){
				contadorTipo2++;
			}
		}

		consumoMedio = minutosTotais / contadorTipo1;

		porcentagemTipo2 = ((double) contadorTipo2 / (double) qtde) * 100;

	    int opcao;

		do {
		    System.out.println();
    		System.out.println("MENU DE OPCOES:");
    		System.out.println("1) Relatorio de clientes");
    		System.out.println("2) A receita total");
    		System.out.println("3) Conta foi mais barata ");
    		System.out.println("4) Consumo medio de clientes tipo 1.");
    		System.out.println("5) Clientes que consumiram acima de 120 pulsos. ");
    		System.out.println("6) A porcentagem de clientes tipo 2 ");
    		System.out.println("7) Sair");
    		System.out.print("Informe uma opcao: ");
    		opcao= s.nextInt();
    		System.out.println();
    		
            switch(opcao){
                case 1:
                    for(int i = 0; i<qtde; i++) {
    				System.out.printf("%s, %s, Tipo %s, Minutos: %d, Conta = R$ %.2f\n", nome[i], telefone[i], tipo[i], minutos[i], valorDaConta[i]);
    			}
    			break;
    			case 2:
				    System.out.printf("Receita total = R$ %.2f\n", receitaTotal);
				    break;
			    case 3:
					for(int i = 0; i <qtde; i++){
						if(valorDaConta[i] < menorConta){
							menorConta = valorDaConta[i];
						}
					}
					System.out.printf("A conta mais barata é R$: %.2f\n", menorConta);
			        break;
			    case 4:
					
					System.out.println("O consumo médio dos clientes do Tipo 1: " + consumoMedio);
			        break;
			    case 5:
				for(int i = 0; i<qtde; i++) {
					if (minutos[i] > 120) {
						System.out.printf("%s, %s, Tipo %s, Minutos: %d, Conta = R$ %.2f\n", nome[i], telefone[i], tipo[i], minutos[i], valorDaConta[i]);
					}
				}
			        break;
		        case 6:
					System.out.printf("Porcentagem de clientes tipo 2: %.2f%%\n", porcentagemTipo2);
			        break;
			    case 7:
			        break;
			    default:
			        System.out.println("Escolha uma opção válida.");
			        break;
            }
        }while(opcao != 7);
        System.out.println("FIM DO PROGRAMA!");
		s.close();
	}
}