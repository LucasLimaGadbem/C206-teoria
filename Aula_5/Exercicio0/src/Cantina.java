public class Cantina {

    String nome;
    Salgado[] salgados = new Salgado[3];

    public void addSalgado(Salgado novoSalgado){
        for (int j = 0; j < salgados.length; j++) {
            if(salgados[j] == null) {
                salgados[j] = novoSalgado;
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println(nome);
        for(int i = 0; i < salgados.length; i++){
            if(salgados[i] != null) {
                System.out.println(i + " - " + salgados[i].nome);
            }
        }
    }

}
