package Exercicio56;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        int idade;

        System.out.println("Digite nome: ");
        Scanner leitor = new Scanner(System.in);
        nome = leitor.nextLine();
        System.out.println("Digite idade: ");
        idade = leitor.nextInt();
        System.out.println("\n");
        System.out.println("Nome = " + nome);
        System.out.println("Idade = " + idade);
    }
}
