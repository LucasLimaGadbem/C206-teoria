package RedesSociais;

public class Instagram extends RedeSocial{

    //construtor para criar a uma conta no Instagram com senha e numero de amigos
    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    //personalizando para o instagram
    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no Instagram!");
    }

    //escrevendo funcoes que foram herdadas da RedeSocial onde eram abstratas
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Instagram!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Instagram!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Instagram!");
    }

    @Override
    public void executar() {
        postarFoto();
        postarVideo();
        postarComentario();
        curtirPublicacao();
    }
}
