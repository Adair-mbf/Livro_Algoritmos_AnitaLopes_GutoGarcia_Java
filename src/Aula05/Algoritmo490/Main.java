package Aula05.Algoritmo490;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] nome = new String[10];
        int L;

        for (L = 0; L < 10; L++) {
            System.out.print("Digite palavra em letras minúsculas " + (L + 1) + ": ");
            nome[L] = leitor.nextLine();
        }

        int qtdSubstituidas = substituirC(nome);
        System.out.println("\nTotal de letras 'c' substituídas: " + qtdSubstituidas);

        for (L = 0; L < 10; L++) {
            System.out.println((L + 1) + " - " + nome[L]);
        }

        leitor.close();
    }

    static int substituirC(String[] vet) {
        int totalSubstituidas = 0;
        for (int i = 0; i < vet.length; i++) {
            int contC = 0;
            for (char letra : vet[i].toCharArray()) {
                if (letra == 'c') {
                    contC++;
                }
            }
            // Substitui 'c' por '*'
            if (contC > 0) {
                vet[i] = vet[i].replace("c", "*");
                totalSubstituidas += contC;
            }
        }
        return totalSubstituidas;
    }
}


