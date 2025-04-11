package Aula04.Algoritmo348;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int L;
        String[] nomes = new String[5];
        float[] pr1 = new float[5];
        float[] pr2 = new float[5];
        float[] media = new float[5];

        for(L = 0; L <= 4; L++) {
            System.out.println("Digite " + (L + 1) + " nome: ");
            nomes[L] = leitor.nextLine();
            System.out.println("Digite a 1º nota: ");
            pr1[L] = leitor.nextFloat();
            System.out.println("Digite a 2º nota: ");
            pr2[L] = leitor.nextFloat();

            media[L] = (pr1[L] + pr2[L])/2;

            leitor.nextLine();
        }
        System.out.print( "\n\n\n\t\t\t\tRELACAO FINAL\n");
        for(L = 0; L <= 4; L++) {
            System.out.println(( L + 1 ) + "- " + nomes[L]);
            System.out.printf("\n %.1f\t %.1f\t %.1f\n", pr1[L], pr2[L], media[L]);
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
