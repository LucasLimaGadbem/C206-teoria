package Exercicio2;

public class Zumbi {

    double vida;
    String nome;

    double mostraVida(){
        return vida;
    }

    void tranfereVida(Zumbi zumbiAlvo, double quantia){

        this.vida = zumbiAlvo.vida;
    }
}
