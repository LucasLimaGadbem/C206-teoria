import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        Set<Integer> hashset = new HashSet<>();
        Map<Integer, Integer> mapa = new HashMap<>();
        int tam = 100000;
        long t1, t2;

        //inserindo na lista (arraylist)
        t1 = System.currentTimeMillis();
        for (int i = 0; i < tam; i++) {
            lista.add(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("Tempo para inserir na List: " + (t2-t1)+"ms");

        //inserindo no hashset
        t1 = System.currentTimeMillis();
        for (int i = 0; i < tam; i++) {
            hashset.add(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("Tempo para inserir no HashSet: " + (t2-t1)+"ms");

        //inserindo no hashmap
        t1 = System.currentTimeMillis();
        for (int i = 0; i < tam; i++) {
            mapa.put(i,i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("Tempo para inserir no Map: " + (t2-t1)+"ms");

        //buscando na list (arraylist)
        t1 = System.currentTimeMillis();
        for (int i = 0; i < tam; i++) {
            lista.contains(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("Tempo para buscar na List: " + (t2-t1) + "ms");

        //buscando no hashSet
        t1 = System.currentTimeMillis();
        for (int i = 0; i < tam; i++) {
            hashset.contains(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("Tempo para buscar no HashSet: " + (t2-t1) + "ms");

        //buscando no hashmap
        t1 = System.currentTimeMillis();
        for (int i = 0; i < tam; i++) {
            mapa.containsKey(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("Tempo para buscar no Map: " + (t2-t1) + "ms");
    }
}