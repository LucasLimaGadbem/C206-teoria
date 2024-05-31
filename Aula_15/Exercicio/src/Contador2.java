public class Contador2 implements Runnable{

    String nome = "contador2";

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i+" "+nome);
        }
    }
}
