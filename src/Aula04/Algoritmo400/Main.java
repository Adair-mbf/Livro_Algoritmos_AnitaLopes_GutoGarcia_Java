package Aula04.Algoritmo400;

import java.util.Scanner;

public class Main {
    static final int TOTAL_QUARTOS = 50;
    static int[] leitos = new int[TOTAL_QUARTOS];
    static String[] situacoes = new String[TOTAL_QUARTOS];
    static String[] datasEntrada = new String[TOTAL_QUARTOS];
    static String[] datasSaida = new String[TOTAL_QUARTOS];
    static int[] diarias = new int[TOTAL_QUARTOS];
    static String[] nomes = new String[TOTAL_QUARTOS];
    static String[] telefones = new String[TOTAL_QUARTOS];
    static double[] precos = new double[TOTAL_QUARTOS];
    static double[] despesas = new double[TOTAL_QUARTOS];
    static boolean cadastrados = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Hotel Fazenda Sucesso ===");
            System.out.println("1. Cadastrar quartos");
            System.out.println("2. Listar todos os quartos");
            System.out.println("3. Listar quartos desocupados");
            System.out.println("4. Alugar / Reservar quarto");
            System.out.println("5. Registrar despesas extras");
            System.out.println("6. Calcular despesas do quarto");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (!cadastrados) {
                        for (int i = 0; i < TOTAL_QUARTOS; i++) {
                            System.out.println("Quarto " + (i + 1));
                            System.out.print("Número de leitos: ");
                            leitos[i] = sc.nextInt();
                            System.out.print("Preço da diária: ");
                            precos[i] = sc.nextDouble();
                            sc.nextLine();
                            situacoes[i] = "LIVRE";
                            despesas[i] = 0;
                        }
                        cadastrados = true;
                        System.out.println("Cadastro concluído!");
                    } else {
                        System.out.println("Os quartos já foram cadastrados.");
                    }
                    break;

                case 2:
                    for (int i = 0; i < TOTAL_QUARTOS; i++) {
                        System.out.printf("Quarto %d - Situação: %s\n", i + 1, situacoes[i]);
                    }
                    break;

                case 3:
                    for (int i = 0; i < TOTAL_QUARTOS; i++) {
                        if (situacoes[i].equalsIgnoreCase("LIVRE")) {
                            System.out.printf("Quarto %d está LIVRE\n", i + 1);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Número do quarto (1-50): ");
                    int q = sc.nextInt() - 1;
                    sc.nextLine();

                    if (!situacoes[q].equalsIgnoreCase("LIVRE")) {
                        System.out.println("Esse quarto já está ocupado ou reservado.");
                        break;
                    }

                    System.out.print("Nome do hóspede: ");
                    nomes[q] = sc.nextLine();
                    System.out.print("Telefone: ");
                    telefones[q] = sc.nextLine();
                    System.out.print("Data de entrada: ");
                    datasEntrada[q] = sc.nextLine();
                    System.out.print("Data de saída: ");
                    datasSaida[q] = sc.nextLine();
                    System.out.print("Número de diárias: ");
                    diarias[q] = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Digite 'A' para Alugar ou 'R' para Reservar: ");
                    String tipo = sc.nextLine();
                    situacoes[q] = tipo.equalsIgnoreCase("A") ? "ALUGADO" : "RESERVADO";
                    System.out.println("Dados do quarto atualizados.");
                    break;

                case 5:
                    System.out.print("Número do quarto (1-50): ");
                    int quartoDesp = sc.nextInt() - 1;
                    System.out.print("Valor da despesa extra: ");
                    double valor = sc.nextDouble();
                    despesas[quartoDesp] += valor;
                    System.out.println("Despesa adicionada com sucesso.");
                    break;

                case 6:
                    System.out.print("Número do quarto (1-50): ");
                    int quartoCalc = sc.nextInt() - 1;
                    double total = precos[quartoCalc] * diarias[quartoCalc] + despesas[quartoCalc];
                    System.out.println("Nome do hóspede: " + nomes[quartoCalc]);
                    System.out.println("Telefone: " + telefones[quartoCalc]);
                    System.out.printf("Total da conta: R$ %.2f\n", total);
                    break;

                case 7:
                    System.out.println("Saindo... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 7);
        sc.close();
    }
}

