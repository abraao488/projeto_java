package Funcionario;

import java.util.Scanner;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cadastro de Funcionário ---");
        System.out.print("Digite a matrícula do funcionário: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário bruto do funcionário: ");
        double salarioBruto = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(matricula, nome, salarioBruto);
        funcionario.exibirContracheque();

        scanner.close();
    }
}