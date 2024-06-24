package sistema;

public class PagamentoDinheiro extends Pagamento {
    public PagamentoDinheiro(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento em dinheiro, valor: " + getValor());
    }
}