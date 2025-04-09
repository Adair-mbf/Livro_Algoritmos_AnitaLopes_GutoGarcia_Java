package Aula04.Exercicio346;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String frase;
        String espelhada;
        int op;
        int x;

        espelhada = "";
        Scanner leitor = new Scanner(System.in);
        do{
            System.out.println("MENU");
            System.out.println("1 - Imprime o comprimento da frase");
            System.out.println("2 - Imprime os dois primeiros e os dois ultimos caracteres da frase");
            System.out.println("3 - Imprime a frase espelhada");
            System.out.println("4 - Termina o algoritmo");
            System.out.println("OPCAO: ");

            op = leitor.nextInt();
            leitor.nextLine();
            if (op == 1) {
                System.out.println("Digite uma frase: ");
                frase = leitor.nextLine();
                System.out.println("Número de caracteres da frase: " + frase.replace(" ", "").length());
            }
            else{
                if(op == 2){
                    System.out.println("Digite uma frase: ");
                    frase = leitor.nextLine();
                    System.out.println("Os dois primeiros caracteres: "+frase.substring(0, 2));
                    System.out.println("Os dois últimos caracteres: "+frase.substring(frase.length() - 2));
                }
                else {
                    if (op == 3) {
                        System.out.println("Digite uma frase: ");
                        frase = leitor.nextLine();
                        for (x = frase.length() - 1; x >= 0; x--) {
                            espelhada += frase.charAt(x);
                        }
                        System.out.println("Frase espelhada: " + espelhada);
                    } else {
                        if (op == 4) {
                            System.out.println("Fim do algoritmo");
                        } else {
                            System.out.println("Opção não disponível");
                        }
                    }
                }
                System.out.print("\n");
            }
        }while(op != 4);
        leitor.close();
    }
}
