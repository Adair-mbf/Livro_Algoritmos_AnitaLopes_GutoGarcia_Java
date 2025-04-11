package Aula03.Exercicio62;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float preco;
        double npreco;

        System.out.println("Digite o valor do produto: ");
        preco = leitor.nextFloat();

        npreco = preco * 0.91;

        System.out.printf("Preço com desconto: R$ %.2f \n", npreco);
    }
}
