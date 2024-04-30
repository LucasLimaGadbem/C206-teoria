public class Paulista extends Classe{

    private String capital;

    public Paulista(String nome, int idade, String capital) {
        super(nome, idade);
        this.capital = capital;
    }

    public String getCapital() {
        return capital;
    }
}
