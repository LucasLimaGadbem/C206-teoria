import java.util.Scanner;
import java.util.Random;

public class Exercício6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // para criar uma variavel aleatoria
        Random rand = new Random();

        int numGerado, numAdivinhado;

        // gerando um numero entre 1 e 10
        numGerado = rand.nextInt(10) + 1;

        // analisando se acertou ou nao
        do{
            System.out.println("Qual o número que estou pensando: ");
            // tentando adivinhar
            numAdivinhado = entrada.nextInt();

            if(numAdivinhado != numGerado){
                // vendo se o numero tentado é maior que o gerado
                if(numAdivinhado < numGerado) {
                    System.out.println("Errou, o meu número é maior");
                }
                // vendo se o numero tentado é menor que o gerado
                else{
                    System.out.println("Errou, O meu número é menor");}
            }
        }while(numGerado != numAdivinhado);

        // acertou o numero gerado
        System.out.println("Parabéns você acertou meu número");

        entrada.close();
    }
}
