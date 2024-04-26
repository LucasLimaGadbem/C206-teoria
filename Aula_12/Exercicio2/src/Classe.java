public abstract class Classe implements Comparable <Classe>{

    protected String nome;
    protected int idade;

    public Classe(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public int compareTo(Classe o) {
        return Integer.compare(o.idade, idade);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
