package Exercicio4;

public class Main {
    public static void main(String[] args) {

        Zumbi z1 = new Zumbi();
        z1.vida = 200;
        z1.nome = "Chris";

        Zumbi z2 = new Zumbi();
        z2.vida = 300;
        z2.nome = "Jorge";

        System.out.println("A vida inicial do "+z1.nome+" é "+z1.mostraVida());
        System.out.println("A vida inicial do "+z2.nome+" é "+z2.mostraVida());

        if(z2.tranfereVida(z1, 400)) {
            System.out.println("O zumbi "+z2.nome+" transfere 400 para "+z1.nome);
            System.out.println("A vida do "+z1.nome+" é "+z1.mostraVida());
            System.out.println("A vida do "+z2.nome+" é "+z2.mostraVida());
        }
        else {
            System.out.println("Vida insuficiente para transferencia");
        }
        if(z1.tranfereVida(z2, 100)){
            System.out.println("O zumbi "+z1.nome+" transfere 100 para "+z2.nome);
            System.out.println("A vida do "+z1.nome+" é "+z1.mostraVida());
            System.out.println("A vida do "+z2.nome+" é "+z2.mostraVida());
        }
        else{
            System.out.println("Vida insuficiente para transferencia");
        }
    }
}
