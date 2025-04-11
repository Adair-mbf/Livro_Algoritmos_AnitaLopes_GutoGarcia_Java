package Aula04.Exercicio413;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] n = new int [5][5];
        int L;
        int c;
        int t;
        int soma;

        for(L = 0; L < 5; L++){
            for(c = 0; c < 5; c++){
                System.out.println("Digite elemento: " + (L + 1) + " - " + (c + 1) + " : ");
                n[L][c] = scanner.nextInt();
            }
        }
        System.out.print("\nToda a matriz\n");
        for(L = 0; L < 5; L++){
            for(c = 0; c < 5; c++){
                System.out.print(n[L][c] + "\t");
            }
            System.out.print("\n");
        }
        soma = 0;
        for(L = 1; L < 5; L++){
            for(c = 5 - L; c < 5; c++){
                if(n[L][c] % 2 == 1){
                    soma = soma + ((n[L][c])*(n[L][c]));
                }
            }
        }
        System.out.print("\n\nraiz quadrada da soma dos quadrados dos números ímpares: " + sqrt(soma));
    }
}
