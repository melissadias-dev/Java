import java.util.Scanner;

public class media {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual é o seu nome? ");
        String nome = leia.nextLine();

        float[] notas = new float[4];
        float soma = 0;

        for(int i = 0; i < 4; i++){
            System.out.println("Informe a nota do " + (i+1) + "º Bimestre: ");
            notas[i] = leia.nextFloat();
            soma += notas[i];
        }

        float media = soma / 4;

        System.out.println("\nOlá, " + nome + "!");

        if (media >= 5) {
            System.out.println("Sua média foi de " + media + ". Parabéns! Você foi aprovado!");
        } else {
            System.out.println("Sua média resultou em " + media + ". Você não foi aprovado!");
        }

        leia.close();
    }
}