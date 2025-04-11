package Aula04.Algoritmo362;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vet1 = new int[10];
        int[] vet2 = new int[20];
        int[] vetc = new int[10];
        int i;
        int c;
        int d;
        int L;

        L = 0;

        System.out.println("entrada de dados do vetor 1 ( 10 elementos)");

        for(i = 0 ; i <= 9; i++){
            System.out.println("entre com " + (i + 1) + " elemento: ");
            vet1[i] = leitor.nextInt();
        }

        System.out.print("\n");

        System.out.println("entrada de dados do vetor 2 ( 20 elementos)");
        for(i = 0 ; i <= 19; i++){
            System.out.println("entre com " + (i + 1) + " elemento: ");
            vet2[i] = leitor.nextInt();
        }

        for(i = 0 ; i <= 9; i++){
            vetc[i] = -999999999;
        }

        for(i = 0 ; i <= 9; i++){
            c = 0;
            while(vet1[i] != vet2[c] && c < 19){
                c++;
            }
            if(vet1[i] == vet2[c] ){
                d = 0;
                while(vet1[i] != vetc[d] && d < L){
                    d++;
                }
                if(d == L){
                    vetc[d] = vet1[i];
                    L++;
                }
            }
        }
        if(L != 0){
            System.out.print("\n\nElementos comuns\n\n");
            for(i = 0 ; i <= L -1 ; i++){
                System.out.println(vetc[i]);
            }
        }
        else{
            System.out.print("\n\nNao existem elementos comuns");
        }
        System.out.print("\n");
    }
}
