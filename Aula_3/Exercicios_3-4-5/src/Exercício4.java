import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int matriculados = entrada.nextInt();

        switch (matriculados)
        {
            case 10, 20:
                System.out.println("Sala I-16");
                break;
            case 30:
                System.out.println("I-22");
                break;
            default:
                System.out.println("Número tem que ser 10, 20 ou 30");
        }
        entrada.close();
    }
}
