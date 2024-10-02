// Classe base Cliente
// Esta é uma classe abstrata que serve como base para tipos específicos de clientes
abstract class Cliente {
    // Atributos protegidos da classe Cliente
    protected String nome;       // Nome do cliente
    protected String endereco;   // Endereço do cliente
    protected String email;      // Email do cliente

    // Construtor da classe Cliente
    public Cliente(String nome, String endereco, String email) {
        this.nome = nome;         // Inicializa o atributo nome
        this.endereco = endereco; // Inicializa o atributo endereco
        this.email = email;       // Inicializa o atributo email
    }

    // Método abstrato para mostrar os dados do cliente
    // Este método deve ser implementado nas subclasses
    public abstract void mostrarDados();
}
