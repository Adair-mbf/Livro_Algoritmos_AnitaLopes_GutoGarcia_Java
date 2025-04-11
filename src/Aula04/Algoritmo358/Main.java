package Aula04.Algoritmo358;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float [] precocompra = new float[100];
        float [] precovenda = new float[100];
        float lucro;
        int A;
        int totlucromenor10 = 0;
        int totlucromenor20 = 0;
        int totlucromaior20 = 0;

        for(A = 0; A < 100; A++){
            System.out.println("Preço de compra: ");
            precocompra[A] = leitor.nextFloat();
            System.out.println("Preço de venda: ");
            precovenda[A] = leitor.nextFloat();
        }

        for(A = 0; A < 100; A++){
            lucro = ((precovenda[A] - precocompra[A]) / precocompra[A]) * 100;
            if(lucro < 10.0){
                totlucromenor10++;
            }
            else{
                if(lucro <= 20.0){
                    totlucromenor20++;
                }
                else{
                    totlucromaior20++;
                }
            }
        }
        System.out.println("total de mercadorias com lucro < 10%: " + totlucromenor10);
        System.out.println("total de mercadorias com 10% <= lucro <= 20%: " + totlucromenor20);
        System.out.println("total de mercadorias com lucro > 20%: " + totlucromaior20);
        System.out.print("\n");

        leitor.close();
    }
}
