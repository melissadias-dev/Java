public class Cachorro extends Animal{
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void reproduzirsom(){
        System.out.println(this.nome + ": AUAUAU");
    }
}
