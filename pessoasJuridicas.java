import java.util.Scanner;

// Classe PessoaJuridica que herda de Cliente
class PessoaJuridica extends Cliente {
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj, String endereco, String email) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Pessoa Jurídica:");
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + endereco);
        System.out.println("Email: " + email);
    }
}