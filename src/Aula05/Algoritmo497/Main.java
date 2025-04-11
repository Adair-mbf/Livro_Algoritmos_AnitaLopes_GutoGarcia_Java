package Aula05.Algoritmo497;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int [] num = new int[10];
        int L;
        int c;
        int n;
        int aux;

        for(L = 0; L < 10; L++) {
            System.out.println("Digite número : " + (L + 1) + ": ");
            num[L] = leitor.nextInt();
        }

        System.out.println("Digite número de busca: ");
        n = leitor.nextInt();

        ordena(num, 10);

        c = busca(num, 10, n);

        System.out.print("\nVETOR\n");

        for(L = 0; L < 10; L++) {
            System.out.println((L+1) + " - " + num[L]);
        }

        c++;

        if(c != 0){
            System.out.print("\n\nposicao no vetor: " + c);
        }
        else{
            System.out.print("\nnão ENCONTRADO");
        }
        System.out.print("\n");
        leitor.close();
    }
    static int busca(int[] vet, int tam, int chave){
        int i;
        int ini;
        int meio;
        int fim;
        int n;

        ini = 0;
        fim = tam - 1;

        while(ini <= fim){
            meio = (ini + fim) / 2;
            if(chave == vet[meio]){
                return meio;
            }
            else{
                if(chave < vet[meio]){
                    fim = meio - 1;
                }
                else{
                    ini = meio + 1;
                }
            }
        }
        meio = -1;
        return meio;
    }
    static void ordena(int[] vet, int tam){
        int L1;
        int c1;
        int aux;
        for(L1 = 0; L1 < tam-1; L1++) {
            for(c1 = L1 + 1; c1 < tam; c1++) {
                if(vet[L1] > vet[c1]){
                    aux = vet[L1];
                    vet[L1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
    }
}
