import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int matriculados = entrada.nextInt();

        // analisando o numero de alunos matriculados
        switch (matriculados)
        {
            // se o numero de alunos matriculados for 10 ou 20
            case 10, 20:
                System.out.println("Sala I-16");
                break;
            // se o numero de alunos matriculados for 30
            case 30:
                System.out.println("I-22");
                break;
            // se o numero de alunos matriculados for diferente de 10, 20 ou 30
            default:
                System.out.println("Número tem que ser 10, 20 ou 30");
                break;
        }
        entrada.close();
    }
}
