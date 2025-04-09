package Aula03.Exercicio55;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float diagmaior;
        float diagmenor;
        float area;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Medida da diagonal maior: ");
        diagmaior = leitor.nextFloat();
        System.out.println("Medida da diagonal menor: ");
        diagmenor = leitor.nextFloat();

        area = (diagmaior * diagmenor) / 2;

        System.out.printf("Area = %.2f\n", area);
    }
}
