// Classe base Cliente
abstract class Cliente {
    protected String nome;
    protected String endereco;
    protected String email;

    public Cliente(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    public abstract void mostrarDados();
}