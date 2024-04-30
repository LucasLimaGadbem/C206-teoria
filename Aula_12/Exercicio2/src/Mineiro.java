public class Mineiro extends Classe{

    private String comida;

    public Mineiro(String nome, int idade, String comida) {
        super(nome, idade);
        this.comida = comida;
    }

    public String getComida() {
        return comida;
    }
}
