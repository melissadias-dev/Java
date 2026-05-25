public class Vaca extends Animal {
    public Vaca(String nome) {
        super(nome);
    }

    @Override
    public void reproduzirsom() {
        System.out.println(this.nome + ": MUUUUU");
    }
}
