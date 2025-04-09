package Aula04.Exercicio354;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int L;
        int[] num = new int[15];

        for(L = 0; L < 15; L++){
            System.out.println("Digite " + (L + 1) + " numero: ");
            num[L] = leitor.nextInt();
        }

        System.out.print("\nRELACAO DOS NUMEROS\n");
        for(L = 0; L < 15; L++){
            System.out.print("\n" + (L + 1) + "- " + num[L]);
            if(num[L] % 2 == 0){
                System.out.println(" é PAR");
            }
            else{
                System.out.println(" é IMPAR");
            }
        }
        System.out.print("\n");
    }
}
