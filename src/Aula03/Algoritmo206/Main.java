package Aula03.Algoritmo206;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
         int i;
         int quant;
         float num;
         float maior;
         float menor;

         System.out.println("Quantos números você quer digitar? ");
         quant = leitor.nextInt();
         System.out.println("Entre com um número: ");
         num = leitor.nextFloat();
         maior = num;
         menor = num;
         for (i = 1; i < quant; i++) {
             System.out.println("Entre com um número: ");
             num = leitor.nextFloat();
             if(num > maior) {
                 maior = num;
             }
             else{
                 if(num < menor) {
                     menor = num;
                 }
             }
         }
         System.out.println("Maior: " + maior);
         System.out.println("Menor: " + menor);
         System.out.print("\n");
    }
}
