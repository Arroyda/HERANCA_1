import java.util.Scanner;

// Classe principal para testar
public class heranca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja registrar um (1) Cliente ou (2) Funcionário?");
        int escolha = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer

        if (escolha == 1) {
            System.out.println("\n\nRegistrar um Cliente. É (1) Pessoa Física ou (2) Pessoa Jurídica?");
            int tipoCliente = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            System.out.print("\n\nNome: ");
            String nome = scanner.nextLine();
            System.out.print("Endereço: ");
            String endereco = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();

            if (tipoCliente == 1) {
                System.out.print("CPF: ");
                String cpf = scanner.nextLine();
                PessoaFisica pf = new PessoaFisica(nome, cpf, endereco, email);
                pf.mostrarDados();
            } else if (tipoCliente == 2) {
                System.out.print("CNPJ: ");
                String cnpj = scanner.nextLine();
                PessoaJuridica pj = new PessoaJuridica(nome, cnpj, endereco, email);
                pj.mostrarDados();
            } else {
                System.out.println("Tipo de cliente inválido.");
            }
        } else if (escolha == 2) {
            System.out.print("\n\nNome: ");
            String nome = scanner.nextLine();
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            System.out.print("Endereço: ");
            String endereco = scanner.nextLine();
            System.out.print("Salário: ");
            double salario = scanner.nextDouble();

            Funcionario f = new Funcionario(nome, cpf, endereco, salario);
            f.mostrarDados();
        } else {
            System.out.println("Escolha inválida.");
        }

        scanner.close();
    }
}
