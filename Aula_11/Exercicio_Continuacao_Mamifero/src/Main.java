public class Main {
    public static void main(String[] args) {
        Cachorro m1 = new Cachorro("Cachorro", 200);
        Lontra m2 = new Lontra("Lontra", 300);
        Boi m3 = new Boi("Boi", 400);

        m1.emitirSom();
        m1.mostraInfo();
        m2.emitirSom();
        m2.mostraInfo();
        m2.nadar();
        m3.emitirSom();
        m3.mostraInfo();
    }
}