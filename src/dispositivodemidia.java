public abstract class dispositivodemidia {
    protected String nomedodispositivo;

    public dispositivodemidia(String nome){

        this.nomedodispositivo = nome;
    }
    public abstract void reproduzir();

    public void desligar(){
        System.out.println(this.nomedodispositivo + "está desligando.");
    }
}
