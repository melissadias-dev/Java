public class Caminhao extends Veiculo{
    public Caminhao(String nome){
        super(nome);
    }

    @Override
    public void mostrarinformacoes() {
        System.out.println("Modelo: " + this.nome + "\nVelocidade Máxima: 125km/h" + "\nTipo de Buzina: Marítima\n");
    }
}