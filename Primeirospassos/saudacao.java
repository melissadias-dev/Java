import java.util.Scanner;

public class saudacao {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nome = leia.nextLine();

        System.out.println("Informe a sua idade: ");
        int idade = leia.nextInt();

        System.out.println("É uma alegria ter você por aqui! Seja muito bem-vindo(a) " + nome + ", você tem " + idade + " anos, muito bom!");
    }
}
