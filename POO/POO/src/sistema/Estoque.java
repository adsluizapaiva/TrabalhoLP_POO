package sistema;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<Produto, Integer> produtos;

    public Estoque() {
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        produtos.put(produto, produtos.getOrDefault(produto, 0) + quantidade);
    }

    public void removerProduto(Produto produto, int quantidade) {
        if (produtos.containsKey(produto)) {
            int quantidadeAtual = produtos.get(produto);
            if (quantidadeAtual >= quantidade) {
                produtos.put(produto, quantidadeAtual - quantidade);
            } else {
                System.out.println("Quantidade insuficiente no estoque!");
            }
        } else {
            System.out.println("Produto não encontrado no estoque!");
        }
    }

    public void exibirEstoque() {
        for (Map.Entry<Produto, Integer> entry : produtos.entrySet()) {
            System.out.println("Produto: " + entry.getKey().getNome() + ", Quantidade: " + entry.getValue());
        }
    }
}
