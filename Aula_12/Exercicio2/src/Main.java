import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Classe> classes = new ArrayList<>();

        Mineiro m1 = new Mineiro("Lucas",20,"Pao De Queijo");
        Mineiro m2 = new Mineiro("Murilo",19,"Queijo");
        Paulista p1 = new Paulista("Lanna", 21, "Sao Paulo");
        Paulista p2 = new Paulista("Tulio", 22, "Campinas");
        Carioca c1 = new Carioca("Virginia", 22, "Cha Mate");
        Carioca c2 = new Carioca("Matheus", 25, "Guarana De Penedo");

        classes.add(m1);
        classes.add(m2);
        classes.add(p1);
        classes.add(p2);
        classes.add(c1);
        classes.add(c2);

        Collections.sort(classes);

        System.out.println("Mais velho para o mais novo");

        /*
        for (int i = 0; i < classes.size(); i++) {
            System.out.println(classes.get(i).getNome());
        }
        */

        for (Classe c : classes){
            if(c instanceof Paulista) {
                Paulista px = (Paulista) c;
                System.out.println(px.getNome() + " " + px.getIdade() + " " + px.getCapital());
            }
            if(c instanceof Mineiro){
                Mineiro mx = (Mineiro) c;
                System.out.println(mx.getNome() + " " + mx.getIdade() + " " + mx.getComida());
            }
            if(c instanceof Carioca) {
                Carioca cx = (Carioca) c;
                System.out.println(cx.getNome() + " " + cx.getIdade() + " " +  cx.getBebida());
            }
        }
    }
}