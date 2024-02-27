import java.util.Scanner;
import java.util.Random;

public class Exercício5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Random rand = new Random();

        int numGerado, numAdivinhado;

        numGerado = rand.nextInt(10) + 1;

        do{
            System.out.println("Qual o número que estou pensando: ");
            numAdivinhado = entrada.nextInt();

            if(numAdivinhado != numGerado){
                System.out.println("Errou");
            }
        }while(numGerado != numAdivinhado);

        System.out.println("Parabéns você acertou meu número");

        entrada.close();
    }
}
