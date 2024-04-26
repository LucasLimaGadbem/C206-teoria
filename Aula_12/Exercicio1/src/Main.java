import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main{
    public static void main(String[] args) {

        List<Double> lista = new ArrayList<>();

        lista.add(1.5);
        lista.add(2.0);
        lista.add(1.0);
        lista.add(0.1);
        lista.add(2.1);

        System.out.println("Lista normal");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        Collections.sort(lista);
        Collections.reverse(lista);

        System.out.println("Lista Ordenada");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

    }
}