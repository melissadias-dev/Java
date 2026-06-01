//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class centraldecontrole {
    public void apertarPlay(dispositivodemidia dispositivo) {
        System.out.println("Conectando ao dispositivo: " + dispositivo.nomedodispositivo);
        dispositivo.reproduzir();
        System.out.println("---");
    }
    public static void main(String[] args) {
        centraldecontrole controle = new centraldecontrole();
        smarttv tvdasala = new smarttv("TV da sala", "Matrix");
        celular meucelular = new celular("IPhone 15", "Stairway to Heaven", "Led Zeppelin");
        radioautomatico radiodocarro = new radioautomatico("Rádio do Carro", 98.9);

        controle.apertarPlay(tvdasala);
        controle.apertarPlay(meucelular);
        controle.apertarPlay(radiodocarro);

        System.out.println("\n>> Demonstração com uma lista de dispositivos <<");

        dispositivodemidia[] meusdispositivos = {tvdasala, meucelular, radiodocarro};

        for (dispositivodemidia dispositivo : meusdispositivos) {
            dispositivo.reproduzir();
        }
    }
}