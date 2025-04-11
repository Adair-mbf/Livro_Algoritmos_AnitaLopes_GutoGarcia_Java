package Aula05.Algoritmo460;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a;
        int c;

        for(c=1; c<=3; c++){
            System.out.println("\nDigite numero: ");
            a = leitor.nextInt();
            System.out.println("dobro: " + dob(a));
        }
        leitor.close();
    }
    static int dob(int x){
        return x * 2;
    }
}
