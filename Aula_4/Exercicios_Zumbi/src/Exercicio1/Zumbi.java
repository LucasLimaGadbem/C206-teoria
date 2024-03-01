package Exercicio1;

public class Zumbi {
    int vida;
    String nome;
    float altura;
    int forca;

    void iniciar(){
        vida = 100;
        nome = "Anna";
        altura = 1.40F;
        forca = 99999;
    }

    void andar(){
        System.out.println("Zumbi está andando...");
    }

    void seAlimentar(){
        System.out.println("Zumbi está se alimentando...");
    }
}

