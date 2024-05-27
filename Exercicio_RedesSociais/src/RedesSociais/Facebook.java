package RedesSociais;

import Excecoes.CompartilharFotoVideo;

public class Facebook extends RedeSocial implements VideoConferencia, RedesSociais.Compartilhamento {

    private int aux1 = 0;
    private int aux2 = 0;

    //construtor para criar a uma conta no Facebook com senha e numero de amigos
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    //sobrescrevendo a funcao compartilhar implementada a partir do Compartilhamento
    @Override
    public void compartilhar() throws CompartilharFotoVideo{
        //analisando o que o usuario pode compartilhar
        if(aux1 != 0 && aux2 != 0){
            System.out.println("Compartilhou no Facebook");
        }
        else if(aux1 != 0){
            System.out.println("Compartilhou no Facebook uma foto!");
        }
        else if (aux2 != 0) {
            System.out.println("Compartilhou no Facebook um video!");
        }
        else{
            throw new CompartilharFotoVideo("Nao tem foto nem video para compartilhar");
        }
    }

    //sobrescrevendo a funcao fazStreaming implementada a partir do VideoConferencia
    @Override
    public void fazStreaming() {
        System.out.println("Fez um streaming no Facebook!");
    }

    //escrevendo funcoes que foram herdadas da RedeSocial onde eram abstratas
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Facebook!");
        aux1++;
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Facebook!");
        aux2++;
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Facebook!");
    }

    @Override
    public void executar(){
        //analisando se houve uma excecao
        try{
         compartilhar();
        }catch (CompartilharFotoVideo e){
            System.out.println(e.getMessage());
        }
        postarFoto();
        postarVideo();
        postarComentario();
        fazStreaming();
    }
}
