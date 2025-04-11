package Aula05.Algoritmo480;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n;
        int x;

        System.out.println("Digite número: ");
        n = leitor.nextInt();

        x = reverso(n);
        System.out.println(n + " - " + x);

        if(x==n){
            System.out.println("É um número capicua");
        }
        else{
            System.out.println("Não é um número capicua");
        }

        System.out.print("\n");
        leitor.close();
    }
    static int reverso(int num) {
        int soma;
        int r;

        soma = 0;

        while(num != 0){
            r = num % 10;
            soma = (soma * 10) + r;
            num = num / 10;
        }
        return soma;
    }
}
