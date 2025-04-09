package Aula03.Exercicio207;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num1;
        int num2;
        int i;
        int soma;
        System.out.println("Entre com o multiplicando: ");
        num1 = leitor.nextInt();
        System.out.println("Entre com o multiplicador: ");
        num2 = leitor.nextInt();
        soma = 0;
        for (i = 1; i <= num2; i++) {
            soma = soma + num1;
        }
        System.out.println("Produto: " + soma);
        System.out.print("\n");
    }
}
