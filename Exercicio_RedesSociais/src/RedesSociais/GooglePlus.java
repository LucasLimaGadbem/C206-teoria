package RedesSociais;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{

    //construtor para criar a uma conta no GooglePlus com senha e numero de amigos
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    //sobrescrevendo a funcao compartilhar implementada a partir do Compartilhamento
    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no GooglePlus!");
    }

    //sobrescrevendo a funcao fazStreaming implementada a partir do VideoConferencia
    @Override
    public void fazStreaming() {
        System.out.println("Fez um streaming no GooglePlus!");
    }

    //escrevendo funcoes que foram herdadas da RedeSocial onde eram abstratas
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no GooglePlus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no GooglePlus!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no GooglePlus!");
    }

    @Override
    public void executar() {
        compartilhar();
        postarFoto();
        postarVideo();
        postarComentario();
        fazStreaming();
    }
}
