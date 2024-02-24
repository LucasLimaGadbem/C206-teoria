import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int npa;
        int np3;

        System.out.println("Digite a sua NPA: ");
        npa = entrada.nextInt();

        // npa >= 60 eh aprovado
        if(npa >= 60)
        {
            System.out.println("Deu bom!");
        }
        // npa < 60 faz recuperacao
        else{
            System.out.println("Ainda tem como...");

            System.out.println("Digite a nota NP3: ");
            np3 = entrada.nextInt();

            // se a media da np3 e da npa for maior que 50 aprovado
            if((np3+npa)/2 >= 50)
            {
                System.out.println("Deu bom!");
            }
            // se for menor reprovado
            else{
                System.out.println("Até semestre que vem.");
            }
        }

        entrada.close();
    }
}
