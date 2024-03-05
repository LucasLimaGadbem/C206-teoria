package Exercicio5;

public class Main {
    public static void main(String[] args) {
        Personagem personagem1 = new Personagem();
        personagem1.nome = "Personagem";

        Arma arma1 = new Arma();
        arma1.nome = "Arma1";

        //agregando
        personagem1.arma = arma1;

        System.out.println("Resistencia da arma1 é: "+arma1.resistencia);
        System.out.println("Os pontos do personagem1 é: "+personagem1.pontos);
        System.out.println("Personagem1 tomou dano -5 pontos");
        personagem1.tomarDano();
        System.out.println("Usou a arma -2 de resistencia");
        personagem1.usarArmas();
        System.out.println("Resistencia da arma1 é: "+arma1.resistencia);
        System.out.println("Os pontos do personagem1 é: "+personagem1.pontos);
        System.out.println("Informacoes da arma");
        arma1.mostrarInfoArmas();
        System.out.println(arma1.descricao);

    }
}
