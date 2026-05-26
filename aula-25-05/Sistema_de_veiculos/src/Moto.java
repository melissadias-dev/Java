public class Moto extends Veiculo{
    public Moto(String nome){
        super(nome);
    }

    @Override
    public void mostrarinformacoes() {
        System.out.println("Modelo: " + this.nome + "\nVelocidade Máxima: 90km/h" + "\nTipo de Buzina: Disco\n");
    }
}
