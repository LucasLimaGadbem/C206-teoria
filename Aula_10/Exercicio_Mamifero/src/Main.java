public class Main {
    public static void main(String[] args) {

        Mamifero m1 = new Cachorro("Cachorro", 200);
        Mamifero m2 = new Lontra("Lontra", 300);
        Mamifero m3 = new Boi("Boi", 400);

        m1.emitirSom();
        m1.mostraInfo();
        m2.emitirSom();
        m2.mostraInfo();
        m3.emitirSom();
        m3.mostraInfo();
    }
}