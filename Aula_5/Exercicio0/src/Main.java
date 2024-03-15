public class Main {
    public static void main(String[] args) {

        Cantina cantina = new Cantina();

        Salgado salgado1 = new Salgado();
        Salgado salgado2 = new Salgado();
        Salgado salgado3 = new Salgado();

        salgado1.nome = "Hamburgao";
        salgado2.nome = "BolinhaDeQueijo";
        salgado3.nome = "Kibe";

        cantina.nome = "Cantina do Inatel";

        cantina.addSalgado(salgado1);
        cantina.addSalgado(salgado2);
        cantina.addSalgado(salgado3);

        cantina.mostraInfo();
    }
}