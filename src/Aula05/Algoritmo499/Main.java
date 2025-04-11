package Aula05.Algoritmo499;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int [] num = new int[5];
        int L;
        int flag;
        int op;
        flag = 0;
        for(L = 0; L < 5; L++) {
            num[L] = 0;
        }
        do{
            System.out.print("\n\n\n");
            System.out.print("\n MENU VETOR - FUNCAO \n");
            System.out.println("1. Dados do VETOR");
            System.out.println("2. Ordena VETOR");
            System.out.println("3. Imprime VETOR ");
            System.out.println("4. Sai do programa");
            System.out.println("OPCAO:");
            op = leitor.nextInt();

            switch(op) {
                case 1: entrada(num, 5, leitor);
                    flag = 1;
                    break;

                case 2: if(flag == 1) {
                        ordena(num, 5);
                    }
                    else{
                        System.out.println("Escolha primeiro opcao 1");
                    }
                    break;

                case 3: if(flag == 1) {
                    imprime(num, 5);
                    }
                    else{
                        System.out.println("Escolha primeiro opcao 1");
                    }
                    break;

                case 4: System.out.println("Saindo do Algoritmo");
                    break;

                default: System.out.println("Opção inválida");
            }
        }while(op != 4);
        System.out.print("\n");
        leitor.close();
    }
    static void entrada(int [] vet, int t, Scanner leitor) {
        int L;
        System.out.println("Entrada do VETOR\n");
        for(L = 0; L < t; L++) {
            System.out.println("Digite número :" + (L+1) + ": ");
            vet[L] = leitor.nextInt();
        }
    }
    static void imprime(int [] vet, int t){
        int L;
        System.out.print("\nVETOR\n");
        for(L = 0; L < t; L++) {
            System.out.println((L+1) + " - " + vet[L]);
        }
    }
    static void ordena(int[] vet, int tam){
        int L1;
        int c1;
        int aux;
        for(L1 = 0; L1 < tam-1; L1++) {
            for(c1 = L1 + 1; c1 < tam; c1++) {
                if(vet[L1] > vet[c1]) {
                    aux = vet[L1];
                    vet[L1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
    }
}
