package Exercicio3;

public class Zumbi {

    double vida;
    String nome;

    double mostraVida(){
        return this.vida;
    }

    void tranfereVida(Zumbi zumbiAlvo, double quantia){

        vida = vida - quantia;
        zumbiAlvo.vida = zumbiAlvo.vida + quantia;
    }
}
