package sistema;

public class Vendedor extends Pessoa {
    private double salario;

    public Vendedor(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void exibirDados() {
        System.out.println("Vendedor: " + getNome() + ", CPF: " + getCpf() + ", Salário: " + salario);
    }
}