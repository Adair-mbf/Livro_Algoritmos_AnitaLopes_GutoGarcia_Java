package Aula04.Exercicio360;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] ultdia = new int[12];
        int data;
        int i;
        int dia;
        int mes;
        String[] signo =  new String[12];

        for(i = 0; i < 12; i++) {
            System.out.println("Digite signo: ");
            signo[i] = leitor.nextLine();
            System.out.println("Digite último dia: ");
            ultdia[i] = leitor.nextInt();

            leitor.nextLine();
        }

        System.out.println("Digite data no formato ddmm ou 9999 para terminar: ");
        data = leitor.nextInt();

        while(data != 9999){
            dia = (data / 100);
            mes = (data % 100);
            mes --;

            if(dia > ultdia[mes]){
                mes = (mes + 1) % 12;
            }

            System.out.print("\nsigno: " + signo[mes] + "\n");
            System.out.println("Digite data no formato ddmm ou 9999 para terminar: ");
            data = leitor.nextInt();
        }

        System.out.print("\n");
        leitor.close();
    }
}
