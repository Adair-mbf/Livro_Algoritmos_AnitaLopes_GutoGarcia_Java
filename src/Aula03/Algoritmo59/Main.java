package Aula03.Exercicio59;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Entrar com 1 cateto: ");
        b = leitor.nextFloat();
        System.out.println("Entrar com 2 cateto: ");
        c = leitor.nextFloat();

        a = Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2));
        System.out.printf("A hipotenusa e %.2f: \n", a);
    }
}
