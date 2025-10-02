package Filme;

import java.util.Scanner;

public class PlataformaStreamingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Filme filmeCadastrado = null; // Para armazenar o filme cadastrado

        int opcao;
        do {
            System.out.println("\n--- Menu da Plataforma de Streaming ---");
            System.out.println("1. Cadastrar um título");
            System.out.println("2. Exibir os detalhes do título");
            System.out.println("3. Avaliar o título");
            System.out.println("4. Calcular e exibir a média das avaliações");
            System.out.println("5. Encerrar o programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Cadastro de Título ---");
                    System.out.print("Nome do filme: ");
                    String nome = scanner.nextLine();
                    System.out.print("Gênero: ");
                    String genero = scanner.nextLine();
                    System.out.print("Ano de lançamento: ");
                    int ano = scanner.nextInt();
                    System.out.print("Duração em minutos: ");
                    int duracao = scanner.nextInt();
                    filmeCadastrado = new Filme(nome, genero, ano, duracao);
                    System.out.println("Filme cadastrado com sucesso!");
                    break;
                case 2:
                    if (filmeCadastrado != null) {
                        filmeCadastrado.exibirDetalhes();
                    } else {
                        System.out.println("Nenhum filme cadastrado ainda.");
                    }
                    break;
                case 3:
                    if (filmeCadastrado != null) {
                        System.out.print("Digite sua nota (0 a 10) para o filme: ");
                        int nota = scanner.nextInt();
                        filmeCadastrado.avaliar(nota);
                    } else {
                        System.out.println("Nenhum filme cadastrado para avaliar.");
                    }
                    break;
                case 4:
                    if (filmeCadastrado != null) {
                        System.out.printf("A média das avaliações para '%s' é: %.2f\n", filmeCadastrado.nome, filmeCadastrado.calcularMediaAvaliacoes());
                    } else {
                        System.out.println("Nenhum filme cadastrado para calcular a média.");
                    }
                    break;
                case 5:
                    System.out.println("Encerrando a plataforma de streaming. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}