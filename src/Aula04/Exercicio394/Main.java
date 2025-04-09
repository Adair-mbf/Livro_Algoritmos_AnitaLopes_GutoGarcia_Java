package Aula04.Exercicio394;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int L;
        int c;
        int tam;
        int flag;
        int flag1;
        int flag2;
        float [] nota1 = new float [50];
        float [] nota2 = new float [50];
        float [] media = new float [50];
        String [] nomes = new String [50];
        String op;

        flag = 0;
        flag1 = 0;
        flag2 = 0;

        do{
            System.out.print("\n\n\n");
            System.out.print("\n MENU \n");
            System.out.println("1 - ENTRAR NOMES");
            System.out.println("2 - ENTRAR 1º NOTA");
            System.out.println("3 - ENTRAR 2º NOTA");
            System.out.println("4 - CALCULAR MÉDIA");
            System.out.println("5 - LISTAR NO DISPLAY");
            System.out.println("6 - SAIR");
            System.out.println("OPCAO: ");
            op = leitor.nextLine();

            if(op.equals("1")){
                flag = 1;
                for( L = 0; L <= 49 ; L++){
                    System.out.println("Digite " + (L+1) + " nome (com até 30 caracteres e todas as letras maiusculas): ");
                    nomes[L] = leitor.nextLine();
                    while(nomes[L].length() > 30){
                        System.out.println("Nome com até 30 caracteres. Digite " + (L+1) + " nome(todas as letras maiúsculas): ");
                        nomes[L] = leitor.nextLine();
                    }
                    tam = nomes[L].length();
                    if(tam < 30){
                        for(c = 0;c <= 30 - tam; c++){
                            nomes[L] = nomes[L] + " ";
                        }
                    }
                }
            }
            else if(op.equals("2")){
                if(flag ==0 ){
                System.out.println(" NAO TEM NOME CADASTRADO");
                }
                else{
                    for(L = 0; L <= 49 ; L++){
                        System.out.println("Digite a 1º nota: ");
                        nota1[L] = leitor.nextFloat();
                        leitor.nextLine();
                    }
                    flag1 = 1;
                }
            }
            else if(op.equals("3")){
                if(flag == 0 ){
                    System.out.println(" NAO TEM NOME CADASTRADO");
                }
                else{
                    for(L = 0; L <= 49 ; L++){
                        System.out.println("Digite a 2º nota: ");
                        nota2[L] = leitor.nextFloat();
                        leitor.nextLine();
                    }
                    flag2 = 1;
                }
            }
            else if(op.equals("4")){
                if(flag == 0 || flag1 == 0 || flag2 == 0){
                    System.out.println(" NEM TODOS OS DADOS ESTÃO CADASTRADOS");
                }
                else{
                    for(L = 0; L <= 49 ; L++){
                        media[L] = ((3*nota1[L]) + (7*nota2[L]))/10;
                    }
                }
            }
            else if(op.equals("5")){
                if(flag == 0 || flag1 == 0 || flag2 == 0){
                    System.out.println(" NEM TODOS OS DADOS ESTÃO CADASTRADOS");
                }
                else{
                    System.out.print( "\nNOME\t\t\t\tNOTA1\tNOTA2\tMEDIA\n");
                    for(L = 0; L <= 49 ; L++){
                        System.out.print("\n" + nomes[L] + "\t" + nota1[L] + "\t" + nota2[L] + "\t" + media[L]);
                    }
                }
            }
            else if(op.equals("6")){
                break;
            }
            else{
                System.out.println("OPCAO NÃO DISPONÍVEL");
            }
        }while(!op.equals("6"));
    }
}
