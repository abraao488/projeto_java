package Filme;

// Classe Filme
public class Filme { // Public para ser acessível de outras classes
    String nome;
    String genero;
    int ano;
    int duracao; // Duração em minutos
    double somaNotas;
    int qtdAvaliacoes;

    public Filme(String nome, String genero, int ano, int duracao) {
        this.nome = nome;
        this.genero = genero;
        this.ano = ano;
        this.duracao = duracao;
        this.somaNotas = 0;
        this.qtdAvaliacoes = 0;
    }

    public void exibirDetalhes() {
        System.out.println("\n--- Detalhes do Título ---");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano de Lançamento: " + ano);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.printf("Média de Avaliações: %.2f (total de %d avaliações)\n", calcularMediaAvaliacoes(), qtdAvaliacoes);
        System.out.println("--------------------------");
    }

    public void avaliar(int nota) {
        if (nota >= 0 && nota <= 10) {
            somaNotas += nota;
            qtdAvaliacoes++;
            System.out.println("Avaliação registrada com sucesso!");
        } else {
            System.out.println("A nota deve ser entre 0 e 10.");
        }
    }

    public double calcularMediaAvaliacoes() {
        if (qtdAvaliacoes == 0) {
            return 0.0;
        }
        return somaNotas / qtdAvaliacoes;
    }
}