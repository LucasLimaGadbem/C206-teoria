import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Ana",1190001010);
        Cliente c2 = new Cliente("Clara",1201112121);
        Cliente c3 = null;

        Conta conta = new Conta(500, 300);

        conta.addCliente(c1);
        conta.addCliente(c2);
        conta.addCliente(c3);

        conta.mostraInfo();

        System.out.println("Acabou");
    }
}