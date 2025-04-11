package Aula04.Algoritmo351;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int L;
        int num;
        String[] nomes = new String[5];

        for(L = 0; L <= 4; L++) {
            System.out.println("nome " + (L + 1) + ": ");
            nomes[L] = leitor.nextLine();
        }
        System.out.print("Digite o número da pessoa: ");
        num = leitor.nextInt();
        System.out.print("\n");

        while(num < 1 || num > 5){
            System.out.println("Número fora do intervalo");
            System.out.print("\n");
            System.out.println("Digite o número da pessoa: ");
            num = leitor.nextInt();
            System.out.print("\n");
        }

        System.out.println(nomes[num - 1]);
    }
}
