package Aula03.Algoritmo54;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float a;
        float b;

        System.out.println("Entre com a base: ");
        a = leitor.nextFloat();
        System.out.println("Entre com a altura do triângulo: ");
        b = leitor.nextFloat();
        System.out.printf("Área = %.2f%n \n", (a * b)/2);
    }
}
