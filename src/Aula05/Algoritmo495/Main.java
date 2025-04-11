package Aula05.Algoritmo495;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[][] nome = new String[5][1];

        for (int L = 0; L < 5; L++) {
            System.out.println("Digite nome: ");
            nome[L][0] = leitor.nextLine();
        }

        ordena(nome, 5);

        System.out.print("\n\nNOMES ORDENADOS\n");
        for (int L = 0; L < 5; L++) {
            System.out.println((L + 1) + "  - " + nome[L][0]);
        }

        System.out.print("\n");
        leitor.close();
    }

    static void ordena(String[][] vet, int tam) {
        String aux;
        for (int L1 = 0; L1 < (tam - 1); L1++) {
            for (int c1 = L1 + 1; c1 < tam; c1++) {
                if (vet[L1][0].compareTo(vet[c1][0]) > 0) {
                    aux = vet[L1][0];
                    vet[L1][0] = vet[c1][0];
                    vet[c1][0] = aux;
                }
            }
        }
    }
}
