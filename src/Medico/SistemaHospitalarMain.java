package Medico;

public class SistemaHospitalarMain {
    public static void main(String[] args) {
        Medico medicoGenerico = new Medico("Dr. João", "CRM/SP 12345");
        ClinicoGeral clinico = new ClinicoGeral("Dra. Maria", "CRM/MG 67890");
        Cirurgiao cirurgiao = new Cirurgiao("Dr. Pedro", "CRM/RJ 11223", "Geral");

        System.out.println("--- Médicos no Sistema ---");
        medicoGenerico.exibirInformacoes();
        clinico.exibirInformacoes();
        clinico.realizarAtendimentoGeral();
        cirurgiao.exibirInformacoes();
        cirurgiao.realizarCirurgia();
    }
}