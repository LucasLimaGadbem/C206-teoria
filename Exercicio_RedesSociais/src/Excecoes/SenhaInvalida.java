package Excecoes;

public class SenhaInvalida extends RuntimeException{

    //excecao gerada
    public SenhaInvalida(String message){
        super(message);
    }
}
