package br.inatel.cdg;

import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {
    public static void main(String[] args) {

        String nomeNave1 = "Navinha";
        double vida1 = 200;
        String tipoTiro1 = "Normal";
        Nave nave1 = new Nave(nomeNave1,vida1,tipoTiro1);

        String nomeNave2 = "Navona";
        double vida2 = 1000;
        String tipoTiro2 = "Explosivo";
        Nave nave2 = new Nave(nomeNave2,vida2,tipoTiro2);

        String nomeAst1 = "Asteroidinho";
        String tipoAst1 = "Pequeno";
        Asteroide ast1 = new Asteroide(nomeAst1,tipoAst1);

        String nomeAst2 = "Asteroidao";
        String tipoAst2 = "Grande";
        Asteroide ast2 = new Asteroide(nomeAst2,tipoAst2);

        nave1.atirar(ast1);
        nave1.atirar(ast2);
        System.out.println("");
        nave2.atirar(ast1);
        nave2.atirar(ast2);
    }
}