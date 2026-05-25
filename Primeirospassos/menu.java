import java.util.Scanner;

public class menu {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int programa;

        do {
            System.out.println("------------ MENU -----------");
            System.out.println("Bem-vindo(a) ao menu inicial!");
            System.out.println("Escolha o programa que deseja assistir:");
            System.out.println("     \n       [1]Hora de Aventura     ");
            System.out.println("       [2]Bob Esponja       ");
            System.out.println("       [3]O Incrível Mundo de Gumball       ");
            System.out.println("       [4]Sair      ");
            programa = leia.nextInt();

            switch (programa) {
                case 1:
                    System.out.println("Aventura vai começar...Todos juntos vamos visitar...O mundo de Jack e seu amigo Finn!");
                    break;
                case 2:
                    System.out.println("Vive no abacaxi e mora no mar! BOB ESPONJA CALÇA QUADRADA!");
                    break;
                case 3:
                    System.out.println("Venha se divertir com um gato e um peixinho, Gumball e Darwin! Você vai adorar!");
                    break;
                case 4:
                    System.out.println("Saindo do menu...");
            }

        }while(programa != 4);
    }
}
