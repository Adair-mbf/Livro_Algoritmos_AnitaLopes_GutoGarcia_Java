package Aula03.Exercicio208;

public class Main {
    public static void main(String[] args) {
        int i;
        int ant;
        int atual;
        int prox;

        ant = 0;
        atual =1;

        for(i = 1; i <= 10; i++){
            System.out.print("\n" + atual + " ");
            prox = ant + atual;
            ant = atual;
            atual = prox;
        }
        System.out.println("\n");
    }
}
