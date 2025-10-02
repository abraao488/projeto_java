package Cliente;

import java.util.ArrayList;
import java.util.List;

// Classe Vendedor
public class Vendedor { // Public para ser acessível de outras classes
    String nome;
    String matricula;
    List<Pedido> pedidosEmitidos; // Um vendedor pode emitir vários pedidos

    public Vendedor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.pedidosEmitidos = new ArrayList<>();
    }

    public void adicionarPedidoEmitido(Pedido pedido) {
        this.pedidosEmitidos.add(pedido);
    }

    public void exibirInfoVendedor() {
        System.out.println("Vendedor: " + nome + ", Matrícula: " + matricula);
        System.out.println("Pedidos emitidos:");
        if (pedidosEmitidos.isEmpty()) {
            System.out.println("  Nenhum pedido emitido ainda.");
        } else {
            for (Pedido p : pedidosEmitidos) {
                // Acessa detalhes do pedido
                System.out.println("  - " + p.getNumero() + " (Data: " + p.getData() + ", Valor: R$" + String.format("%.2f", p.getValorTotal()) + ")");
            }
        }
    }

    // Getters para acessar atributos, se necessário por outras classes
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
}
