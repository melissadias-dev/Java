public class Garagem {

    public void guardarVeiculo(Veiculo veiculo){

        System.out.println("Verificando especificações do veículo...\n");

        veiculo.mostrarinformacoes();

        System.out.println("Veículo guardado na garagem com sucesso!\n");
    }
}
