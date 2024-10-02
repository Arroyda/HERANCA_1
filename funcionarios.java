import java.util.Scanner;

// Classe Funcionario
class Funcionario {
    private String nome;
    private String cpf;
    private String endereco;
    private double salario;

    public Funcionario(String nome, String cpf, String endereco, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salario = salario;
    }

    public void mostrarDados() {
        System.out.println("\n\nFuncionário:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Salário: " + salario);
    }
}