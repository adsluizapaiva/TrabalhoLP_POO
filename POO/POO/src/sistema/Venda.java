package sistema;

public class Venda {
    private Cliente cliente;
    private Vendedor vendedor;
    private Carrinho carrinho;
    private Pagamento pagamento;

    public Venda(Cliente cliente, Vendedor vendedor, Carrinho carrinho, Pagamento pagamento) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.carrinho = carrinho;
        this.pagamento = pagamento;
    }

    public void finalizarVenda() {
        pagamento.processarPagamento();
        System.out.println("Venda finalizada com sucesso!");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.println("Total da venda: " + carrinho.calcularTotal());
    }
}
