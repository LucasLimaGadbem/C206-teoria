package Exercicio5;

public class Personagem {
    String nome;
    int pontos = 100;
    Arma arma;

    void usarArmas(){
        arma.resistencia = arma.resistencia - 2;
    }

    void tomarDano(){
        pontos = pontos - 5;
    }
}
