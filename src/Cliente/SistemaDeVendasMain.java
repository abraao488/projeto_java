package Cliente;

import java.time.LocalDate;

public class SistemaDeVendasMain {
    public static void main(String[] args) {
        // Criando clientes e vendedores
        Cliente cliente1 = new Cliente("Ana Costa", "111.222.333-44");
        Cliente cliente2 = new Cliente("Bruno Lima", "555.666.777-88");
        Vendedor vendedor1 = new Vendedor("Carlos Santos", "VD001");
        Vendedor vendedor2 = new Vendedor("Diana Rocha", "VD002");

        // Registrando pedidos
        Pedido pedido1 = new Pedido("PED001", LocalDate.now(), 150.75, cliente1, vendedor1);
        Pedido pedido2 = new Pedido("PED002", LocalDate.of(2023, 10, 20), 300.00, cliente1, vendedor2);
        Pedido pedido3 = new Pedido("PED003", LocalDate.now(), 50.20, cliente2, vendedor1);

        // Exibindo informações
        System.out.println("\n--- Relatórios do Sistema de Vendas ---");
        cliente1.exibirInfoCliente();
        System.out.println();
        cliente2.exibirInfoCliente();
        System.out.println();
        vendedor1.exibirInfoVendedor();
        System.out.println();
        vendedor2.exibirInfoVendedor();

        pedido1.exibirDetalhesPedido();
        pedido2.exibirDetalhesPedido();
        pedido3.exibirDetalhesPedido();
    }
}