package Aula04.Exercicio419;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[][] A = new int[5][5];
        int[][] B = new int[5][5];
        int[][] DIF = new int[5][5];
        int L;
        int c;

        for(L = 0; L < 5; L++){
            for(c = 0; c < 5; c++){
                System.out.println("Digite elemento de A[" + (L + 1) + "][" + (c + 1) + "]: ");
                A[L][c] = leitor.nextInt();
            }
        }

        for(L = 0; L < 5; L++){
            for(c = 0; c < 5; c++){
                System.out.println("Digite elemento de B[" +  (L+1) + "][" + (c + 1) + "]: ");
                B[L][c] = leitor.nextInt();
                DIF[L][c] = A[L][c] - B[L][c];
            }
        }

        System.out.print("\n\tMATRIZ DIFERENCA\n");
        System.out.print("\n");
        for(L = 0; L < 5; L++){
            for(c = 0; c < 5; c++){
                System.out.print("\t" + DIF[L][c]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
