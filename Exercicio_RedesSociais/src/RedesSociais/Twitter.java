package RedesSociais;

public class Twitter extends RedeSocial implements Compartilhamento {

    //construtor para criar a uma conta no Instagram com senha e numero de amigos
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    //sobrescrevendo a funcao compartilhar implementada a partir do Compartilhamento
    @Override
    public void compartilhar() {
        System.out.println("Comentou no Twitter!");
    }

    //personalizando para o Twitter
    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no Twitter!");
    }

    //escrevendo funcoes que foram herdadas da RedeSocial onde eram abstratas
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Twitter!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Twitter!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Twitter!");
    }

    @Override
    public void executar(){
        compartilhar();
        postarFoto();
        postarVideo();
        postarComentario();
        curtirPublicacao();
    }
}
