import java.util.Scanner;

public class medianota {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        float media, n1, n2, n3, n4;

        System.out.println("Qual é o seu nome? ");
        String nome = leia.nextLine();
        System.out.println("Informe a nota do 1º Bimestre: ");
        n1 = leia.nextFloat();
        System.out.println("Informe a nota do 2º Bimestre: ");
        n2 = leia.nextFloat();
        System.out.println("Informe a nota do 3º Bimestre: ");
        n3 = leia.nextFloat();
        System.out.println("Informe a nota do 4º Bimestre: ");
        n4 = leia.nextFloat();

        media = (n1 + n2 + n3 + n4)/4;

        if (media >= 5) {
            System.out.println("Sua média foi de " + media + ". Parabéns! Você foi aprovado!");
        } else {
            System.out.println("Sua média resultou em " + media + ". Você não foi aprovado!");
        }
    }
}
