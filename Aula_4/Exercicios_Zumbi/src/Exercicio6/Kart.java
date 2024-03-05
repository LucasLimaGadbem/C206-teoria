package Exercicio6;

public class Kart {

    String nome;
    Piloto piloto;
    Motor motor;

    public Kart(){
        motor = new Motor();
    }

    void pular(){
        System.out.println("O kart "+nome+" esta pulando o obstaculo");
    }

    void soltarTurbo(){
        System.out.println("O kart "+nome+" esta soltando o turbo, VRUMMMMMMM!!!");
    }

    void fazerDrift(){
        System.out.println("O kart "+nome+" esta fazendo drift");
    }

}
