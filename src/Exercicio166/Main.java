package Exercicio166;

public class Main {
    public static void main(String[] args) {
        int L;
        int c;
        int t;

        System.out.print("\nACIMA DA DIAGONAL PRINCIPAL\n");
        for(L = 1; L <= 9; L++){
            for(t = 1; t < L; t++){
                System.out.print("\t");
            }
            for(c = L + 1; c <= 10; c++){
                System.out.print("\t" + L + "-" + c);
            }
            System.out.print("\n");
        }
    }
}