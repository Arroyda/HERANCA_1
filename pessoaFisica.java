
// Classe PessoaFisica que herda de Cliente
// Representa um cliente do tipo pessoa física
class PessoaFisica extends Cliente {
    private String cpf; // Atributo específico da pessoa física: CPF

    // Construtor da classe PessoaFisica
    public PessoaFisica(String nome, String cpf, String endereco, String email) {
        super(nome, endereco, email); // Chama o construtor da classe base Cliente
        this.cpf = cpf; // Inicializa o atributo cpf
    }

    // Implementação do método abstrato mostrarDados da classe Cliente
    @Override
    public void mostrarDados() {
        System.out.println("\n\nPessoa Física:"); // Exibe um título para os dados da pessoa física
        System.out.println("Nome: " + nome);      // Exibe o nome da pessoa
        System.out.println("CPF: " + cpf);         // Exibe o CPF da pessoa
        System.out.println("Endereço: " + endereco); // Exibe o endereço da pessoa
        System.out.println("Email: " + email);     // Exibe o email da pessoa
    }
}
