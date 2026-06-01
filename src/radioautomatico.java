public class radioautomatico extends dispositivodemidia{
    private double estacaoatualFM;

    public radioautomatico(String nome, double estacao){
        super(nome);
        this.estacaoatualFM = estacao;
    }

    @Override
    public void reproduzir() {
        System.out.println("0 " + this.nomedodispositivo + " está sintonizando na estação de rádio FM");
    }
}
