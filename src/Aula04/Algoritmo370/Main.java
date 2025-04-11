package Aula04.Algoritmo370;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int nv;
        int i;
        int[] voos = new int[1000];
        String[] nome = new String[1000];
        String id;
        String nvd;

        System.out.println("Entre com o número de voos:");
        nv = leitor.nextInt();
        leitor.nextLine(); // Consome o \n após o nextInt

        for (i = 0; i < nv; i++) {
            System.out.println("Entre com a identificação do voo " + (i + 1) + ": ");
            nome[i] = leitor.nextLine();
            System.out.println("Entre com a quantidade de lugares disponíveis no voo " + nome[i] + ": ");
            voos[i] = leitor.nextInt();
            leitor.nextLine(); // Consome o \n após o nextInt
        }

        System.out.println("Entre com o número do voo desejado ou @ para terminar:");
        nvd = leitor.nextLine();

        while (!nvd.equals("@")) {
            i = 0;
            while (i < nv && !nvd.equals(nome[i])) {
                i++;
            }

            if (i < nv && nvd.equals(nome[i])) {
                if (voos[i] > 0) {
                    voos[i]--;
                    System.out.println("Qual o número da identidade do cliente?");
                    id = leitor.nextLine();
                    System.out.println("Identidade: " + id + " Voo: " + nvd + "\n");
                } else {
                    System.out.println("Não existem mais lugares nesse voo.\n");
                }
            } else {
                System.out.println("Não existe este voo\n");
            }

            System.out.println("Entre com o número do voo desejado ou @ para terminar:");
            nvd = leitor.nextLine();
        }
        leitor.close();
    }
}

