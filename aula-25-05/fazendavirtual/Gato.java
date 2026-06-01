public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void reproduzirsom() {
        System.out.println(this.nome + ": MIAU");
    }
}

