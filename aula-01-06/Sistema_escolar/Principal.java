import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Escola escola = new Escola();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n====== SISTEMA ESCOLAR ====");
            System.out.println("Selecione uma opção:\n");
            System.out.println(" [1] Cadastrar Aluno");
            System.out.println(" [2] Exibir Lista de Alunos");
            System.out.println(" [3] Consultar Resumo de Aluno");
            System.out.println(" [4] Sair\n");
            opcao = scanner.nextInt();
            scanner.nextLine();


            switch (opcao) {
                case 1:
                    System.out.println("  >> Informe << ");

                    System.out.println("Nome do aluno:   ");
                    String nome = scanner.nextLine();

                    System.out.println("Série (ex: 3ºAno):   ");
                    String serie = scanner.nextLine();

                    System.out.println("Matrícula: ");
                    int matricula = scanner.nextInt();

                    Aluno novoAluno = new Aluno(nome, serie, matricula);

                    for (int i = 0; i < 4; i++) {
                        System.out.println("Digite a nota do " + (i + 1) + "º Bimestre");
                        double nota = scanner.nextDouble();
                        novoAluno.setNota(i, nota);
                    }
                    scanner.nextLine();

                    escola.cadastrarAluno(novoAluno);
                    break;

                case 2:
                    escola.exibirLista();
                    break;

                case 3:
                    System.out.println("Digite a matrícula do aluno: ");
                    int busca = scanner.nextInt();
                    scanner.nextLine();

                    escola.exibirResumoAluno(busca);
                    break;

                case 4:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 4);
        scanner.close();
    }
}
