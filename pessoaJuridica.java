// Classe PessoaJuridica que herda de Cliente
// Representa um cliente do tipo pessoa jurídica
class PessoaJuridica extends Cliente {
    private String cnpj; // Atributo específico da pessoa jurídica: CNPJ

    // Construtor da classe PessoaJuridica
    public PessoaJuridica(String nome, String cnpj, String endereco, String email) {
        super(nome, endereco, email); // Chama o construtor da classe base Cliente
        this.cnpj = cnpj; // Inicializa o atributo cnpj
    }

    // Implementação do método abstrato mostrarDados da classe Cliente
    @Override
    public void mostrarDados() {
        System.out.println("Pessoa Jurídica:"); // Exibe um título para os dados da pessoa jurídica
        System.out.println("Nome: " + nome);      // Exibe o nome da empresa
        System.out.println("CNPJ: " + cnpj);       // Exibe o CNPJ da empresa
        System.out.println("Endereço: " + endereco); // Exibe o endereço da empresa
        System.out.println("Email: " + email);     // Exibe o email da empresa
    }
}
