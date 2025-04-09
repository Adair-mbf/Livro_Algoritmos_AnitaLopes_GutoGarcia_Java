package Aula04.Exercicio356;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] media = new int[15];
        String[] nomes = new String[15];
        String[] sit = new String[15];
        float[] pr1 = new float[15];
        float[] pr2 = new float[15];

        for (int L = 0; L < 15; L++) {
            System.out.print("\nDigite o nome do " + (L + 1) + "º aluno: ");
            nomes[L] = leitor.nextLine();

            while (nomes[L].length() > 30) {
                System.out.println("Nome com no máximo 30 caracteres. Tente novamente.");
                System.out.print("Digite o nome do " + (L + 1) + "º aluno: ");
                nomes[L] = leitor.nextLine();
            }

            while (nomes[L].length() < 30) {
                nomes[L] += " ";
            }

            System.out.print("Digite a 1ª nota: ");
            pr1[L] = leitor.nextFloat();

            System.out.print("Digite a 2ª nota: ");
            pr2[L] = leitor.nextFloat();
            leitor.nextLine();

            media[L] = (int)((pr1[L] + pr2[L]) / 2 + 0.0001);

            if (media[L] >= 5) {
                sit[L] = "AP";
            } else {
                sit[L] = "RP";
            }
        }
        System.out.println("\n\n\t\t\t\tRELACAO FINAL\n");
        for (int L = 0; L < 15; L++) {
            System.out.println((L + 1) + "- " + nomes[L] + "\t" + pr1[L] + "\t" + pr2[L] + "\t" + media[L] + "\t" + sit[L]);
        }
        leitor.close();
    }
}