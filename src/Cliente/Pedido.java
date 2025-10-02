package Cliente;

import java.time.LocalDate;

// Classe Pedido
public class Pedido { // Public para ser acessível de outras classes
    String numero;
    LocalDate data;
    double valorTotal;
    Cliente cliente; // Um Pedido pertence a um Cliente
    Vendedor vendedor; // Um Pedido é emitido por um Vendedor

    public Pedido(String numero, LocalDate data, double valorTotal, Cliente cliente, Vendedor vendedor) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.vendedor = vendedor;

        // Estabelecendo os relacionamentos bidirecionais
        cliente.adicionarPedido(this);
        vendedor.adicionarPedidoEmitido(this);
    }

    public void exibirDetalhesPedido() {
        System.out.println("\n--- Detalhes do Pedido ---");
        System.out.println("Número: " + numero);
        System.out.println("Data: " + data);
        System.out.printf("Valor Total: R$ %.2f\n", valorTotal);
        System.out.println("Cliente: " + cliente.getNome() + " (CPF: " + cliente.getCpf() + ")");
        System.out.println("Vendedor: " + vendedor.getNome() + " (Matrícula: " + vendedor.getMatricula() + ")");
        System.out.println("--------------------------");
    }

    // Getters para acessar atributos, importante para o relacionamento
    public String getNumero() {
        return numero;
    }

    public LocalDate getData() {
        return data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }
}