import java.util.Scanner;

public class Fazendinha {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        Cachorro dog = new Cachorro("Toco");
        Gato cat = new Gato("Mel");
        Vaca cow = new Vaca("Milka");

        while (opcao != 4){
            System.out.println("--- SEJA BEM VINDO À FAZENDINHA DO MILHO DOURADO ---");
            System.out.println("Escolha o animal que você deseja escutar o som: ");
            System.out.println("[1] Cachorro");
            System.out.println("[2] Gato");
            System.out.println("[3] Vaca");
            System.out.println("[4] Sair");
            System.out.println("Digite sua escolha: ");
            opcao = scanner.nextInt();


            switch (opcao){
                case 1:
                    dog.reproduzirsom();
                    break;
                case 2:
                    cat.reproduzirsom();
                    break;
                case 3:
                    cow.reproduzirsom();
                    break;
                case 4:
                    System.out.println("Saindo da fazendinha...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}
