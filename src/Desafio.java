package src;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldoDisponivel = 1300;
        String nomeCliente = "Davi Winston";
        String tipoConta = "corrente";
        imprimir(saldoDisponivel, nomeCliente, tipoConta);
        imprimirOperacoes();
        int operacao = input.nextInt();

        while (operacao != 4) {
            if (operacao == 1) {
                String mensagem = String.format("O saldo disponível é de %.2f", saldoDisponivel);
                System.out.println(mensagem);

            } else if (operacao == 2) {
                System.out.println("Insira o valor a ser recebido");
                double valorAReceber = input.nextDouble();
                if (valorAReceber < 0) {
                    System.out.println("Valor inválido!");
                } else {
                    saldoDisponivel += valorAReceber;
                    String mensagem = String.format("O saldo total disponível agora é de %.2f", saldoDisponivel);
                    System.out.println(mensagem);
                }

            } else if (operacao == 3) {
                System.out.println("Insira o valor a ser transferido");
                double valorATransferir = input.nextDouble();
                if (valorATransferir > saldoDisponivel) {
                    System.out.println("Saldo insuficiente");
                } else if (valorATransferir < 0) {
                    System.out.println("Valor inválido!");
                } else {
                    saldoDisponivel -= valorATransferir;
                    String mensagem = String.format("O saldo total disponível agora é de %.2f", saldoDisponivel);
                    System.out.println(mensagem);
                }

            } else {
                System.out.println("operação indisponível! Escolha da lista:");
            }
            imprimirOperacoes();
            operacao = input.nextInt();
        }
    }
    private static void imprimir(double saldo, String nome, String tipoConta) {
         String mensagemConsole = String.format("""
                **************************************
                nome:               %s
                tipo conta:         %s
                Saldo:              R$ %.2f
                **************************************
                """, nome, tipoConta, saldo);
        System.out.println(mensagemConsole);
    }
    private static void imprimirOperacoes() {
        String operacoes = """              
                Operações
                1- Consultar saldo;
                2- Receber valor;
                3- Transferir valor;
                4- Sair.
                """;
        System.out.println(operacoes);
    }
}
