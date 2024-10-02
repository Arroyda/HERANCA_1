import java.util.Scanner;

// Classe PessoaFisica que herda de Cliente
class PessoaFisica extends Cliente {
    private String cpf;

    public PessoaFisica(String nome, String cpf, String endereco, String email) {
        super(nome, endereco, email);
        this.cpf = cpf;
    }

    @Override
    public void mostrarDados() {
        System.out.println("\n\nPessoa Física:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Email: " + email);
    }
}