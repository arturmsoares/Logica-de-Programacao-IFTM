/* Leia dois vetores de inteiros x e y, cada um com n elementos. Calcule e mostre os vetores resultantes em cada caso abaixo:

Soma entre x e y : soma de cada elemento de x com o elemento da mesma posição em y. Gerará o vetor soma e o imprimirá através da função imprimirVetor.
Produto entre x e y : multiplicação de cada elemento de x com o elemento da mesma posição em y. Gerará o vetor produto e o imprimirá através da função imprimirVetor.
Obs: No programa em java deverão ser criadas no mínimo 3 funções. Sugestões de funções preencherVetor, imprimirVetor, somaVetor e multiplicaVetor. Ao final, utilize a função imprimeVetor para imprimir o vetor soma e o vetor produto.

(Obrigatório a utilização de funções)



Entrada
Um número inteiro n correspondente ao tamanho dos vetores e então n números inteiros que irão preencher o vetor cada um dos vetores.



Saída
Uma linha apresentando os novos vetores soma e produto, conforme exemplo abaixo
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //declarando o tamanho dos vetores
        int n = s.nextInt();
        
        //declarando os vetores indicando seu tamanho
        int vetorX[] = new int[n];
        int vetorY[] = new int[n];
        
        //preenchendo os vetores
        for (int i = 0; i < n ; i++){
            vetorX[i]=s.nextInt();
        }
        
        for (int i = 0; i < n ; i++){
            vetorY[i]=s.nextInt();
        }
        
        // Calculando a soma e o produto de valores de mesma posição dos vetoresatravés da chamada de funções
        int[] resultadoSoma = somarVetor(vetorX, vetorY);
        int[] resultadoProduto = multiplicarVetor(vetorX, vetorY);
        
        // Imprimindo os resultados
        imprimeVetor(resultadoSoma, resultadoProduto);
        
        s.close();
    }
    

    //Utilizando a função somarVetor para encontrar a soma dos valores de mesma posição de x e y
    static int[] somarVetor( int vetorX[], int vetorY[]) {
        int[] vetorSoma = new int[vetorX.length];
        for (int i = 0; i < vetorX.length; i++) {
            vetorSoma[i] = vetorX[i] + vetorY[i];
        }
        return vetorSoma;
    }
    //Utilizando a função multiplicarVetor para encontrar o produto dos valores de mesma posição de x e y
    static int[] multiplicarVetor(int vetorX[], int vetorY[]) {
        int[] vetorProduto = new int[vetorX.length];
        for (int i = 0; i < vetorProduto.length; i++) {
            vetorProduto[i] = vetorX[i] * vetorY[i];
        }
        return vetorProduto;
    }
    
    
    static void imprimeVetor (int vetorSoma[], int vetorProduto[]){
        //imprime o primeiro colchete
        System.out.print("Soma : {");
        for(int i=0; i< vetorSoma.length;i++){
            
            //imprime os valores no armazenados no vetor, bem com a virgula até a penultima posição
            System.out.print(vetorSoma[i]);
            if( i< vetorSoma.length -1){
                System.out.print(", ");
            }
        }
        //imprime o último colchete
        System.out.println("}");
        
        System.out.print("Produto : {");
        for(int i=0; i< vetorProduto.length;i++){
            
            //imprime os valores no armazenados no vetor, bem com a virgula até a penultima posição
            System.out.print(vetorProduto[i]);
            if( i< vetorProduto.length -1){
                System.out.print(", ");
            }
        }
        //imprime o último colchete
        System.out.println("}");
        
    }
}