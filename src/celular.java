import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class celular extends dispositivodemidia{
    private String musicaatual;
    private String artista;

    public celular(String nome, String musica, String artista){
        super(nome);
        this.musicaatual = musica;
        this.artista = artista;
    }
    public void reproduzir(){
        System.out.println("0 " + this.nomedodispositivo + " está tocando a música: " + this.musicaatual + " de " + this.artista + ".");
    }
}
