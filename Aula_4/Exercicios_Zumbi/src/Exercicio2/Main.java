package Exercicio2;

public class Main {
    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi();
        zumbi1.vida = 200;
        zumbi1.nome = "Chris";

        Zumbi zumbi2 = new Zumbi();
        zumbi2.vida = 300;
        zumbi2.nome = "Jorge";

        System.out.println("A vida do"+zumbi1.nome+" é "+zumbi1.mostraVida());
        System.out.println("A vida do"+zumbi2.nome+" é "+zumbi2.mostraVida());
        zumbi1.tranfereVida(zumbi2, 100);
        System.out.println("A vida do"+zumbi1.nome+" é "+zumbi1.mostraVida());
        System.out.println("A vida do"+zumbi2.nome+" é "+zumbi2.mostraVida());

    }
}
