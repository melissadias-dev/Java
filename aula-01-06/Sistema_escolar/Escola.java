import java.util.ArrayList;

public class Escola {
    private ArrayList<Aluno> listaAlunos = new ArrayList<>();

    public void cadastrarAluno(Aluno aluno){
        listaAlunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " cadastrado com sucesso!");
    }

    public void exibirLista() {
        System.out.println("====== LISTA DE ALUNOS CADASTRADOS ======");
        if (listaAlunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado no sistema!");
            return;
        }
        for (Aluno aluno : listaAlunos) {
            System.out.println("Nome: .........." + aluno.getNome());
            System.out.println("Série: ........." + aluno.getSerie());
            System.out.println("Matrícula: ....." + aluno.getMatricula() + "\n");
        }
    }


    public void exibirResumoAluno(int matBusca){
            boolean encontrado = false;

            for (Aluno aluno : listaAlunos) {
                if (aluno.getMatricula() == matBusca) {
                    System.out.println(" ==== DADOS DO ALUNO "+ aluno.getNome()+" ====");
                    System.out.println("Nome: .............. " + aluno.getNome());
                    System.out.println("Série: ............. " + aluno.getSerie());
                    System.out.println("Matrícula: ......... " + aluno.getMatricula() + "\n");
                    System.out.println(" --------  BOLETIM ESCOLAR -------- ");
                    double[] notaDoAluno = aluno.getNotas();
                    System.out.println("1º Bimestre: ...... " + notaDoAluno[0]);
                    System.out.println("2º Bimestre: ...... " + notaDoAluno[1]);
                    System.out.println("3º Bimestre: ...... " + notaDoAluno[2]);
                    System.out.println("4º Bimestre: ...... " + notaDoAluno[3] + "\n");
                    System.out.println("Média Final: ...... " + aluno.calcularMedia());
                    System.out.println("Resultado: ........ " + aluno.alunoStatus());
                    System.out.println("------------------------------------");
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado){
                System.out.println("\nAluno não localizado no sistema!");
            }
        }
    }
