package Cliente;

import java.util.ArrayList;
import java.util.List;

// Classe Cliente
public class Cliente { // Public para ser acessível de outras classes
    String nome;
    String cpf;
    List<Pedido> pedidos; // Um cliente pode fazer vários pedidos

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public void exibirInfoCliente() {
        System.out.println("Cliente: " + nome + ", CPF: " + cpf);
        System.out.println("Pedidos realizados:");
        if (pedidos.isEmpty()) {
            System.out.println("  Nenhum pedido ainda.");
        } else {
            for (Pedido p : pedidos) {
                // Acessa detalhes do pedido
                System.out.println("  - " + p.getNumero() + " (Data: " + p.getData() + ", Valor: R$" + String.format("%.2f", p.getValorTotal()) + ")");
            }
        }
    }

    // Getters para acessar atributos, se necessário por outras classes
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}