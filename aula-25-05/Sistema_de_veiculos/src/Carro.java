public class Carro extends Veiculo{
    public Carro(String nome){
        super(nome);
    }

    @Override
    public void mostrarinformacoes() {
        System.out.println("Modelo: " + this.nome + "\nVelocidade Máxima: 190km/h" + "\nTipo de Buzina: Caracol\n");
    }
}
