package Exercicio6;

public class Main {
    public static void main(String[] args) {

        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        kart1.nome = "Azul";
        kart2.nome = "Vermelho";

        kart1.motor.cilindradas = "50";
        kart2.motor.cilindradas = "100";

        kart1.motor.velocidadeMaxima = 120f;
        kart2.motor.velocidadeMaxima = 200f;

        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        piloto1.nome = "Lucas";
        piloto2.nome = "Ana Clara";

        piloto1.vilao = false;
        piloto2.vilao = true;

        // soltando super poder
        System.out.println("Poder para iniciar");
        piloto1.soltaSuperPoder();
        piloto2.soltaSuperPoder();

        // pulando
        System.out.println("Obstaculo a frente");
        kart1.pular();
        kart2.pular();

        // fazendo drift
        System.out.println("Curvaaaaaa");
        kart1.fazerDrift();
        kart2.fazerDrift();

        // soltando turbo
        System.out.println("Uma Reta");
        kart1.soltarTurbo();
        kart2.soltarTurbo();

        // mostrando informacoes dos karts
        System.out.println("Informacoes dos karts");
        System.out.println("Kart 1");
        kart1.motor.mostrarInfo();
        System.out.println("Kart 2");
        kart2.motor.mostrarInfo();
    }
}
