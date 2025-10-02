package Funcionario;

class Funcionario {
    String matricula;
    String nome;
    double salarioBruto;

    public Funcionario(String matricula, String nome, double salarioBruto) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }

    public double calcularInss() {
        return salarioBruto * 0.15; // 15% de desconto do INSS
    }

    public double calcularSalarioLiquido() {
        return salarioBruto - calcularInss();
    }

    public void exibirContracheque() {
        System.out.println("\n--- Contracheque ---");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.printf("Salário Bruto: R$ %.2f\n", salarioBruto);
        System.out.printf("Desconto INSS (15%%): R$ %.2f\n", calcularInss());
        System.out.printf("Salário Líquido: R$ %.2f\n", calcularSalarioLiquido());
        System.out.println("--------------------");
    }
}
