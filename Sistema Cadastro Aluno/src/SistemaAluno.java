import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaAluno {

    static Scanner leia = new Scanner(System.in);
    static List<Aluno> alunos = new ArrayList<>();

    public static void main(String[] args) {

        int opcao = 0;

        while (opcao != 4) {
            mostrarMenu();
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1 -> cadastrarAluno();
                case 2 -> consultarMensalidade();
                case 3 -> mostrarRelatorio();
                case 4 -> System.out.println("Saindo do Sistema Aluno.");
                default -> System.out.println("Opção inválida!");
            }
        }
    }

    // 🔹 MENU
    public static void mostrarMenu() {
        System.out.println("\nBem vindo ao Sistema Aluno");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Ver mensalidade do aluno");
        System.out.println("3 - Mostrar total arrecadado");
        System.out.println("4 - Sair");
        System.out.print("Escolha: ");
    }

    // 🔹 CADASTRO
    public static void cadastrarAluno() {

        System.out.println("Qual o tipo de aluno? (regular, bolsista ou integral): ");
        String tipoAluno = leia.nextLine();

        System.out.println("Digite o nome do aluno: ");
        String nome = leia.nextLine();

        System.out.println("Digite a matrícula do aluno: ");
        String matricula = leia.nextLine();

        System.out.println("Digite o email do aluno: ");
        String email = leia.nextLine();

        System.out.println("Digite a data de nascimento (xx/xx/xxxx): ");
        String dataNascimento = leia.nextLine();

        System.out.println("Digite a série do aluno: ");
        String serie = leia.nextLine();

        Aluno aluno = criarAluno(tipoAluno, nome, matricula, email, dataNascimento, serie);

        if (aluno != null) {
            alunos.add(aluno);
            System.out.println("Aluno cadastrado com sucesso!");
        } else {
            System.out.println("Erro ao cadastrar aluno!");
        }
    }

    // 🔹 FÁBRICA DE ALUNO (melhora organização)
    public static Aluno criarAluno(String tipo, String nome, String matricula,
                                   String email, String dataNascimento, String serie) {

        if (tipo.equalsIgnoreCase("regular")) {
            return new Aluno(nome, matricula, email, dataNascimento, serie);

        } else if (tipo.equalsIgnoreCase("bolsista")) {

            System.out.println("Digite o desconto em %: ");
            double desconto = leia.nextDouble() / 100;
            leia.nextLine();

            return new AlunoBolsista(nome, matricula, email, dataNascimento, serie, desconto);

        } else if (tipo.equalsIgnoreCase("integral")) {
            return new AlunoIntegral(nome, matricula, email, dataNascimento, serie);
        }

        System.out.println("Tipo inválido!");
        return null;
    }

    // 🔹 CONSULTA
    public static void consultarMensalidade() {

        System.out.println("Digite o nome do aluno: ");
        String nome = leia.nextLine();

        for (Aluno a : alunos) {
            if (a.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Mensalidade: R$ " + a.calcularMensalidade());
                return;
            }
        }

        System.out.println("Aluno não encontrado!");
    }

    // 🔹 RELATÓRIO
    public static void mostrarRelatorio() {

        double total = 0;

        System.out.println("\n--------- MENSALIDADES ---------");

        for (Aluno a : alunos) {
            double mensalidade = a.calcularMensalidade();

            total += mensalidade;

            System.out.println("Nome: " + a.getNome());
            System.out.println("Matrícula: " + a.getMatricula());
            System.out.println("Email: " + a.getEmail());
            System.out.println("Série: " + a.getSerie());
            System.out.println("Valor: R$ " + mensalidade);
            System.out.println("--------------------------------");
        }

        System.out.println("Total arrecadado: R$ " + total);
    }
}