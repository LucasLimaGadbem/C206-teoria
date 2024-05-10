import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Lucas",1190001010);

        Conta conta = new Conta(500, 300);

        conta.addCliente(c1);

        conta.mostraInfo();

        try {
            conta.sacar(200);
            conta.sacar(600);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Acabou");
    }
}