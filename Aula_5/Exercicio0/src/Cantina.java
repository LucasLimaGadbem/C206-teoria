public class Cantina {

    String nome;
    Salgado[] salgado = new Salgado[3];

    public void addSalgado(Salgado novoSalgado){
        for (int j = 0; j < salgado.length; j++) {
            if(salgado[j] == null) {
                salgado[j] = novoSalgado;
                break;
            }
        }
    }

    public void mostraInfo(){
        for(int i = 0; i < salgado.length; i++){
            System.out.println(i+" - "+salgado[i].nome);
        }
    }

}
