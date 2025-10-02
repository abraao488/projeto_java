package Medico;

// Subclasse: ClinicoGeral
public class ClinicoGeral extends Medico {
    public ClinicoGeral(String nome, String crm) {
        super(nome, crm);
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Especialidade: Clínico Geral");
    }

    public void realizarAtendimentoGeral() {
        System.out.println(nome + " (Clínico Geral) está realizando um atendimento geral.");
    }
}