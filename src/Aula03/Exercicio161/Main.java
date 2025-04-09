package Aula03.Exercicio161;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int c;
        float num;

        for(c = 1; c <= 5; c++){
            System.out.println("número: ");
            num = leitor.nextFloat();
            System.out.printf("quadrado: %.2f\n", Math.pow(num, 2));
        }

        System.out.print("\n");
    }
}
