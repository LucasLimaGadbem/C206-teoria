package RedesSociais;

import Excecoes.SenhaInvalida;

public abstract class RedeSocial {

    protected String senha;
    protected int numAmigos;

    //construtor para criar a uma rede social com senha e numero de amigos
    public RedeSocial(String senha, int numAmigos) {
        //analisando se o tamanho da senha é válido
        if(senha.length() < 8){
            throw new SenhaInvalida("O valor inserido para senha é inválido");
        }
        else {
            this.senha = senha;
            this.numAmigos = numAmigos;
        }
    }

    //funcao de curtir publicacao
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação!");
    }

    //funcoes que devem ser escritas nas funcoes que herdam de RedeSocial
    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();
    public abstract void executar();
}
