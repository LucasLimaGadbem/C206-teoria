package Exercicio4;

public class Zumbi {

    double vida;
    String nome;

    double mostraVida(){
        return vida;
    }

    boolean tranfereVida(Zumbi zumbiAlvo, double quantia){

        if(vida >= quantia) {
            vida = vida - quantia;
            zumbiAlvo.vida = zumbiAlvo.vida + quantia;
            return true;
        }
        else return false;
    }
}
