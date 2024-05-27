package RedesSociais;

import Excecoes.CompartilharFotoVideo;

public interface Compartilhamento {

    //funcao que deve ser criada em todas as classes que implementarem Compartilhamento
    //CompartilhamentoVideo e CompartilhamentoFoto sao para criar as excecoes
    public void compartilhar() throws CompartilharFotoVideo;
}
