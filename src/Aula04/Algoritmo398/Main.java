package Aula04.Exercicio398;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] cod = new int[50];
        int[] quant = new int[50];
        float[] preco = new float[50];
        String[] nome = new String[50];
        String[] tel = new String[50];

        int k = 0;
        float geral = 0;
        int op;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Alterar Telefone");
            System.out.println("3 - Excluir Contato");
            System.out.println("4 - Listar Telefones");
            System.out.println("5 - Buscar Telefone por Nome");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    if (k >= 50) {
                        System.out.println("Central completa");
                        break;
                    }

                    int codi;
                    System.out.print("Digite o código do produto ou 0 para parar: ");
                    codi = scanner.nextInt();

                    while (k < 50 && codi != 0) {
                        cod[k] = codi;

                        System.out.print("Digite a quantidade do produto: ");
                        quant[k] = scanner.nextInt();

                        System.out.print("Digite o preço do produto: ");
                        preco[k] = scanner.nextFloat();
                        scanner.nextLine();

                        System.out.print("Digite o nome do contato: ");
                        nome[k] = scanner.nextLine();

                        System.out.print("Digite o telefone: ");
                        tel[k] = scanner.nextLine();

                        k++;

                        if (k >= 50) {
                            System.out.println("Central completa");
                            break;
                        }

                        System.out.print("Digite o código do próximo produto ou 0 para parar: ");
                        codi = scanner.nextInt();
                    }
                    break;

                case 2:
                    System.out.print("Digite o nome para alterar o telefone: ");
                    String nnome = scanner.nextLine();
                    int i = 0;
                    while (i < k && !nnome.equals(nome[i])) {
                        i++;
                    }
                    if (i < k) {
                        System.out.print("Digite o novo telefone: ");
                        tel[i] = scanner.nextLine();
                    } else {
                        System.out.println("Nome não cadastrado");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome para excluir: ");
                    nnome = scanner.nextLine();
                    i = 0;
                    while (i < k && !nnome.equals(nome[i])) {
                        i++;
                    }
                    if (i < k) {
                        nome[i] = "Vazio";
                        tel[i] = "";
                        System.out.println("Contato excluído.");
                    } else {
                        System.out.println("Nome não cadastrado");
                    }
                    break;

                case 4:
                    for (i = 0; i < k - 1; i++) {
                        for (int j = i + 1; j < k; j++) {
                            if (nome[i].compareTo(nome[j]) > 0) {
                                String auxNome = nome[i];
                                nome[i] = nome[j];
                                nome[j] = auxNome;

                                String auxTel = tel[i];
                                tel[i] = tel[j];
                                tel[j] = auxTel;
                            }
                        }
                    }

                    System.out.println("\n--- Relação dos Telefones ---");
                    for (i = 0; i < k; i++) {
                        if (!nome[i].equals("Vazio")) {
                            System.out.println("Nome: " + nome[i]);
                            System.out.println("Tel: " + tel[i]);
                            System.out.println();
                        }
                    }
                    break;

                case 5:
                    System.out.print("Digite o nome para buscar: ");
                    nnome = scanner.nextLine();
                    i = 0;
                    while (i < k && !nnome.equals(nome[i])) {
                        i++;
                    }
                    if (i < k) {
                        System.out.println("Nome: " + nome[i]);
                        System.out.println("Tel: " + tel[i]);
                    } else {
                        System.out.println("Nome não cadastrado");
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção não disponível");
            }
        } while (op != 6);
        scanner.close();
    }
}

