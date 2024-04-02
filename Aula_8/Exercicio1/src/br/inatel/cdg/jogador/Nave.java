package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide;

public class Nave {

    private String nome;
    private double vida;
    private String tipoTiro;

    public Nave(String nome, double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroide ast){

        System.out.println(this.nome+" atirando em "+ast.getNome());
        if(ast.getTipoAsteroide().equals("Grande")){
            if(tipoTiro.equals("Normal")){
                System.out.println("Nao destroi, precisa de tiro mais potente");
            }
            else{
                ast.destruir();
            }
        }
        else{
            ast.destruir();
        }
    }
}
