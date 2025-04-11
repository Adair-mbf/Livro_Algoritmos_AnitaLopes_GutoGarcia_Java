package Aula03.Exercicio23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int d;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite número de três casas: ");
        a = leitor.nextInt();
        d = (a % 100) / 10;
        System.out.println("Algarismo da casa das dezenas: " + d);
    }
}
