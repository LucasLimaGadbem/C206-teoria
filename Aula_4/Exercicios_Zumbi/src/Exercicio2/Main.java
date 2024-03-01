package Exercicio2;

public class Main {
    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi();
        zumbi1.vida = 200;
        zumbi1.nome = "Chris";

        Zumbi zumbi2 = new Zumbi();
        zumbi2.vida = 300;
        zumbi2.nome = "Jorge";

        zumbi1.tranfereVida(zumbi2, 100);

        System.out.println(zumbi1.mostraVida());
    }
}
