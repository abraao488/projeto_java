package ContaBancaria;

import java.util.Scanner;

public class SistemaBancarioMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria minhaConta = new ContaBancaria("12345-6", "Alice Silva");
        ContaBancaria contaDestino = new ContaBancaria("78901-2", "Bob Santos"); // Para testar transferência

        int opcao;
        do {
            System.out.println("\n--- Menu Bancário ---");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Transferir");
            System.out.println("0. Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    minhaConta.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor para depositar: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    minhaConta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o valor para sacar: R$ ");
                    double valorSaque = scanner.nextDouble();
                    minhaConta.sacar(valorSaque);
                    break;
                case 4:
                    System.out.print("Digite o valor para transferir: R$ ");
                    double valorTransferencia = scanner.nextDouble();
                    // Assumimos uma conta de destino predefinida para simplificar o exemplo
                    minhaConta.transferir(contaDestino, valorTransferencia);
                    break;
                case 0:
                    System.out.println("Encerrando o sistema bancário. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}