package sistema;

public class Main {
    public static void main(String[] args) {
        // Criando produtos
        Produto produto1 = new Produto("Laptop", 1500.0, 10);
        Produto produto2 = new Produto("Mouse", 50.0, 20);
        Produto produto3 = new Produto("Teclado", 100.0, 15);
        Produto produto4 = new Produto("Monitor", 800.0, 5);

        // Adicionando produtos ao estoque
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(produto1, 10);
        estoque.adicionarProduto(produto2, 20);
        estoque.adicionarProduto(produto3, 15);
        estoque.adicionarProduto(produto4, 5);

        System.out.println("Estoque inicial:");
        estoque.exibirEstoque();
        System.out.println();

        // Criando cliente e vendedor
        Cliente cliente = new Cliente("João", "12345678900", "Rua A, 123");
        Vendedor vendedor = new Vendedor("Maria", "09876543211", 3000.0);

        // Criando itens de venda
        ItemVenda item1 = new ItemVenda(produto1, 1);
        ItemVenda item2 = new ItemVenda(produto2, 2);

        // Criando carrinho e adicionando itens
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(item1);
        carrinho.adicionarItem(item2);

        // Exibindo total do carrinho
        System.out.println("Total do carrinho: " + carrinho.calcularTotal());
        System.out.println();

        // Processando pagamento com cartão
        Pagamento pagamentoCartao = new PagamentoCartao(carrinho.calcularTotal(), "1234-5678-9123-4567");
        Venda venda1 = new Venda(cliente, vendedor, carrinho, pagamentoCartao);
        venda1.finalizarVenda();
        System.out.println();

        // Atualizando estoque após venda
        estoque.removerProduto(produto1, 1);
        estoque.removerProduto(produto2, 2);

        // Exibindo estoque após venda
        System.out.println("Estoque após primeira venda:");
        estoque.exibirEstoque();
        System.out.println();

        // Nova venda com pagamento em dinheiro
        ItemVenda item3 = new ItemVenda(produto3, 1);
        ItemVenda item4 = new ItemVenda(produto4, 1);

        Carrinho novoCarrinho = new Carrinho();
        novoCarrinho.adicionarItem(item3);
        novoCarrinho.adicionarItem(item4);

        // Exibindo total do novo carrinho
        System.out.println("Total do novo carrinho: " + novoCarrinho.calcularTotal());
        System.out.println();

        // Processando pagamento em dinheiro
        Pagamento pagamentoDinheiro = new PagamentoDinheiro(novoCarrinho.calcularTotal());
        Venda venda2 = new Venda(cliente, vendedor, novoCarrinho, pagamentoDinheiro);
        venda2.finalizarVenda();
        System.out.println();

        // Atualizando estoque após segunda venda
        estoque.removerProduto(produto3, 1);
        estoque.removerProduto(produto4, 1);

        // Exibindo estoque após segunda venda
        System.out.println("Estoque após segunda venda:");
        estoque.exibirEstoque();
    }
}
