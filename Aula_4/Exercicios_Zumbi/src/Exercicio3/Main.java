package Exercicio3;

public class Main {
    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi();
        zumbi1.vida = 300;

        Zumbi zumbi2 = new Zumbi();
        zumbi2.vida = 350.6;

        zumbi1 = zumbi2;

        zumbi1.vida = 200;
        zumbi2.vida = 330.8;

        System.out.println("A vida do zumbi1 é: "+zumbi1.mostraVida());
        System.out.println("A vida do zumbi2 é: "+zumbi2.mostraVida());
    }
}
