package Aula05.Algoritmo500;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int [] num = new int[5];
        int [] num1 = new int[5];
        int L;
        int flag;
        int flag1;
        int op;

        flag = 0;
        flag1 = 0;

        for(L = 0; L < 5; L++) {
            num[L] = 0;
            num1[L] = 0;
        }

        do{
            System.out.print("\n\n\n");
            System.out.print("\n VETORES \n");
            System.out.println("1 - Dados do VETOR A");
            System.out.println("2 - Dados do VETOR B");
            System.out.println("3 - Imprime VETORES");
            System.out.println("4 - Soma VETORES");
            System.out.println("5 - Subtrai VETORES");
            System.out.println("6 - Sai do programa");
            System.out.println("OPCAO");

            op = leitor.nextInt();

            switch(op) {
                case 1: entrada(num, 5, "A", leitor);
                    flag = 1;
                    break;
                case 2: entrada(num1, 5, "B", leitor);
                    flag1 = 1;
                    break;
                case 3: if(flag != 0 && flag1 != 0){
                        imprime(num, 5, "A");
                        System.out.print("\n");
                        imprime(num1, 5, "B");
                    }
                    else{
                        System.out.println("Escolha primeiro opções 1 e 2");
                    }
                    break;
                case 4: if(flag != 0 && flag1 != 0){
                            soma(num, num1, 5);
                        }
                        else{
                            System.out.println("Escolha primeiro opções 1 e 2");
                        }
                        break;
                case 5: if(flag != 0 && flag1 != 0){
                            subtrai(num, num1, 5);
                        }
                        else{
                            System.out.println("Escolha primeiro opções 1 e 2");
                        }
                        break;
                case 6: System.out.println("Saindo do algoritmo");
                        break;
                default: System.out.println("Opção inválida");
            }
        }while(op != 6);
        System.out.print("\n");
    }
    static void entrada(int [] vet, int t, String c, Scanner leitor) {
        int L;
        System.out.println("Entrada do VETOR " + c + "\n");
        for(L = 0; L < t; L++) {
            System.out.println("Digite número : " + (L+1) + ": ");
            vet[L] = leitor.nextInt();
        }
    }
    static void imprime(int [] vet, int t, String c){
        int L;
        System.out.println(" VETOR " + c + "\n");
        for(L = 0; L < t; L++) {
            System.out.println((L+1) + " - " + vet[L]);
        }
    }
    static void soma(int [] vet, int [] vet1, int t){
        int L;
        int s;
        System.out.print("\nSOMA\n");
        for(L = 0; L < t; L++) {
            s = vet[L] + vet1[L];
            System.out.println(s);
        }
    }
    static void subtrai(int [] vet, int [] vet1, int t){
        int L;
        int d;
        System.out.print("\nDIFERENÇA\n");
        for(L = 0; L < t; L++) {
            d = vet[L] - vet1[L];
            System.out.println(d);
        }
    }
}
