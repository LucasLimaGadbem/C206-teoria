public class Carioca extends Classe{

    private String bebida;

    public Carioca(String nome, int idade, String bebida) {
        super(nome, idade);
        this.bebida = bebida;
    }

    public String getBebida() {
        return bebida;
    }
}
