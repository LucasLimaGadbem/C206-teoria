public class Computador {

    String marca;
    float preco;
    SistemaOperacional sistemaOperacional;
    HardwareBasico hardwareBasico;
    MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, String nomeSO, int tipo, String nomeHB, float capacidade) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = new SistemaOperacional(nomeSO, tipo);
        this.hardwareBasico = new HardwareBasico(nomeHB, capacidade);
    }

    public void mostraPCConfigs(){
        System.out.println(this.marca);
        System.out.println(this.preco);
        System.out.println(this.sistemaOperacional.nome);
        System.out.println(this.sistemaOperacional.tipo);
        System.out.println(this.hardwareBasico.nome);
        System.out.println(this.hardwareBasico.capacidade);
        System.out.println(this.memoriaUSB.nome);
        System.out.println(this.memoriaUSB.capacidade);
    }

    public void addMemoriaUSB(MemoriaUSB musb){
        this.memoriaUSB = musb;
    }
}
