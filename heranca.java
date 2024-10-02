import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

// Classe principal para testar o sistema de registro de clientes e funcionários
public class heranca {
    public static void main(String[] args) {
        // Cria uma nova instância de Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário se deseja registrar um cliente ou um funcionário
        System.out.println("Deseja registrar um (1) Cliente ou (2) Funcionário?");
        int escolha = scanner.nextInt(); // Lê a escolha do usuário
        scanner.nextLine();  // Limpa o buffer do scanner para evitar problemas com a próxima leitura

        // Verifica se a escolha do usuário é registrar um cliente
        if (escolha == 1) {
            System.out.println("\n\nRegistrar um Cliente. É (1) Pessoa Física ou (2) Pessoa Jurídica?");
            int tipoCliente = scanner.nextInt(); // Lê o tipo de cliente
            scanner.nextLine();  // Limpa o buffer novamente

            // Captura os dados comuns de um cliente
            System.out.print("\n\nNome: ");
            String nome = scanner.nextLine(); // Lê o nome do cliente
            System.out.print("Endereço: ");
            String endereco = scanner.nextLine(); // Lê o endereço do cliente
            System.out.print("Email: ");
            String email = scanner.nextLine(); // Lê o e-mail do cliente

            // Verifica se o cliente é uma pessoa física
            if (tipoCliente == 1) {
                System.out.print("CPF: ");
                String cpf = scanner.nextLine(); // Lê o CPF
                // Cria uma instância de PessoaFisica e exibe os dados
                PessoaFisica pf = new PessoaFisica(nome, cpf, endereco, email);
                pf.mostrarDados();
            } 
            // Verifica se o cliente é uma pessoa jurídica
            else if (tipoCliente == 2) {
                System.out.print("CNPJ: ");
                String cnpj = scanner.nextLine(); // Lê o CNPJ
                // Cria uma instância de PessoaJuridica e exibe os dados
                PessoaJuridica pj = new PessoaJuridica(nome, cnpj, endereco, email);
                pj.mostrarDados();
            } 
            // Caso o tipo de cliente seja inválido
            else {
                System.out.println("Tipo de cliente inválido.");
            }
        } 
        // Verifica se a escolha do usuário é registrar um funcionário
        else if (escolha == 2) {
            // Captura os dados de um funcionário
            System.out.print("\n\nNome: ");
            String nome = scanner.nextLine(); // Lê o nome do funcionário
            System.out.print("CPF: ");
            String cpf = scanner.nextLine(); // Lê o CPF do funcionário
            System.out.print("Endereço: ");
            String endereco = scanner.nextLine(); // Lê o endereço do funcionário
            System.out.print("Salário: ");
            double salario = scanner.nextDouble(); // Lê o salário do funcionário

            // Cria uma instância de Funcionario e exibe os dados
            Funcionario f = new Funcionario(nome, cpf, endereco, salario);
            f.mostrarDados();
        } 
        // Caso a escolha do usuário seja inválida
        else {
            System.out.println("Escolha inválida.");
        }

        // Fecha o scanner para liberar os recursos
        scanner.close();
    }
}
