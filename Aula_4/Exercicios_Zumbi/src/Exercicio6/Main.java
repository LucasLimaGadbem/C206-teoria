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

        System.out.println("Poder para iniciar");
        // soltando super poder
        piloto1.soltaSuperPoder();
        piloto2.soltaSuperPoder();

        // pulando
        System.out.println("Obstaculo a frente");
        kart1.pular();
        kart2.pular();

        System.out.println("Curvaaaaaa");
        // fazendo drift
        kart1.fazerDrift();
        kart2.fazerDrift();

        System.out.println("Corre na reta para ganhar distancia");
        // soltando turbo
        kart1.soltarTurbo();
        kart2.soltarTurbo();

        System.out.println("Informacoes dos karts");
        // mostrando informacoes dos karts
        System.out.println("Kart1");
        kart1.motor.mostrarInfo();
        System.out.println("Kart2");
        kart2.motor.mostrarInfo();
    }
}
