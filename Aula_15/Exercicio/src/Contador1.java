public class Contador1 implements Runnable{

    String nome = "contador1";

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i+" "+nome);
        }
    }
}
