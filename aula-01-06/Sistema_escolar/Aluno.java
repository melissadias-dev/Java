public class Aluno {
    private String nome;
    private String serie;
    private int matricula;
    private double[] notas = new double[4];

    public Aluno(String nome, String serie, int matricula) {
        this.nome = nome;
        this.serie = serie;
        this.matricula = matricula;
    }

    public void setNota(int bimestre, double nota) {
        if (bimestre >= 0 && bimestre < 4) {
            this.notas[bimestre] = nota;
        }
    }
    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / 4;
    }
    public String alunoStatus() {
        if (calcularMedia() >= 5.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public String getNome() { return nome; }
    public String getSerie() { return serie; }
    public double[] getNotas() { return notas; }
    public int getMatricula() {return matricula;}
}