package sistema;

public class Cliente extends Pessoa {
    private String endereco;

    public Cliente(String nome, String cpf, String endereco) {
        super(nome, cpf);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public void exibirDados() {
        System.out.println("Cliente: " + getNome() + ", CPF: " + getCpf() + ", Endereço: " + endereco);
    }
}

