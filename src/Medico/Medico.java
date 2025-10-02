package Medico;

// Classe Base: Medico
public class Medico { // Public para ser acessível de outras classes
    String nome;
    String crm;

    public Medico(String nome, String crm) {
        this.nome = nome;
        this.crm = crm;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", CRM: " + crm);
    }
}