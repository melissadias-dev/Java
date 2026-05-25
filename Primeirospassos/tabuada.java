import java.util.Scanner;

public class tabuada {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int cont = 0, resultado, numero;
        System.out.println("Escolha um número para verificar a tabuada dele: ");
        numero = leia.nextInt();

        while(cont < 10) {
            cont++;
            resultado = numero*cont;
            System.out.println(numero + " X " + cont + " = " + resultado);
        }
        System.out.println("Essa é a tabuada do " + numero);
    }
}
