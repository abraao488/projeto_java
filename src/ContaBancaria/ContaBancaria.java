package ContaBancaria;

// Classe ContaBancaria
public class ContaBancaria { // Public para ser acessível de outras classes
    String numeroConta;
    String titular;
    double saldo;

    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0; // Saldo inicial zero
    }

    public void consultarSaldo() {
        System.out.printf("Saldo atual da conta %s (%s): R$ %.2f\n", numeroConta, titular, saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso. Novo saldo: R$ %.2f\n", valor, saldo);
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor do saque deve ser positivo.");
        } else if (saldo >= valor) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso. Novo saldo: R$ %.2f\n", valor, saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (valor <= 0) {
            System.out.println("O valor da transferência deve ser positivo.");
        } else if (saldo >= valor) {
            this.sacar(valor); // Usa o método sacar da própria conta
            destino.depositar(valor); // Usa o método depositar da conta de destino
            System.out.printf("Transferência de R$ %.2f para a conta %s (%s) realizada com sucesso.\n", valor, destino.numeroConta, destino.titular);
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
    }
}