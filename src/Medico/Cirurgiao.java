package Medico;

// Subclasse: Cirurgiao
public class Cirurgiao extends Medico {
    String especialidadeCirurgica; // Ex: Cardiaca, Ortopédica, Geral

    public Cirurgiao(String nome, String crm, String especialidadeCirurgica) {
        super(nome, crm);
        this.especialidadeCirurgica = especialidadeCirurgica;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Especialidade: Cirurgião (" + especialidadeCirurgica + ")");
    }

    public void realizarCirurgia() {
        System.out.println(nome + " (Cirurgião " + especialidadeCirurgica + ") está realizando uma cirurgia.");
    }
}