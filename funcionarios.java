
// Classe Funcionario representa um funcionário da empresa
class Funcionario {
    // Atributos privados da classe Funcionario
    private String nome;       // Nome do funcionário
    private String cpf;        // CPF do funcionário
    private String endereco;   // Endereço do funcionário
    private double salario;     // Salário do funcionário

    // Construtor da classe Funcionario
    public Funcionario(String nome, String cpf, String endereco, double salario) {
        this.nome = nome;       // Inicializa o atributo nome
        this.cpf = cpf;         // Inicializa o atributo cpf
        this.endereco = endereco; // Inicializa o atributo endereco
        this.salario = salario;   // Inicializa o atributo salario
    }

    // Método para exibir os dados do funcionário
    public void mostrarDados() {
        System.out.println("\n\nFuncionário:"); // Exibe um título para os dados do funcionário
        System.out.println("Nome: " + nome);     // Exibe o nome do funcionário
        System.out.println("CPF: " + cpf);        // Exibe o CPF do funcionário
        System.out.println("Endereço: " + endereco); // Exibe o endereço do funcionário
        System.out.println("Salário: " + salario);   // Exibe o salário do funcionário
    }
}
