public class smarttv extends dispositivodemidia {
    private String filmeatual;
    public smarttv(String nome, String filme){
        super(nome);
        this.filmeatual = filme;
    }
    public void reproduzir(){
        System.out.println("A " + this.nomedodispositivo + " está reproduzindo o filme: " + this.filmeatual + " em 4K.");
    }
}
