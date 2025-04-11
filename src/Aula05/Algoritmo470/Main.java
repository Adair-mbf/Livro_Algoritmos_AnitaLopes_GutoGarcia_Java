package Aula05.Algoritmo470;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num;
        int pri;

        System.out.println("Digite um numero > 0: ");
        num = leitor.nextInt();

        pri = primo(num);

        if (pri == 0) {
            System.out.println(num + " é primo");
        }
        else {
            System.out.println(num + " não é primo");
            System.out.print("\n");
        }
        leitor.close();
    }
    static int primo(int n) {
        int c;
        int p;

        c = 0;
        p = 2;

        while (c == 0 && p <= (n / 2)) {
            if (n % p == 0) {
                c = 1;
            }
            p++;
        }

        return c;
    }
    ;
}

