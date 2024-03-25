import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        Computador[] computador = new Computador[10];
        Cliente cliente = new Cliente();
        int quant = 0;
        int quantPC = 0;

        String m1 = "Positivo";
        float p1 = 3300;
        String nSO1 = "Linux Ubuntu";
        int t1 = 32;
        String nHB1 = "Pentium Core i3";
        float capacidade1 = 2200;
        String nCP1 = "Pen-drive";
        int capaCP1 = 16;
        Computador c1 = new Computador(m1,p1,nSO1,t1,nHB1,capacidade1);
        MemoriaUSB memoriaUSB1 = new MemoriaUSB(nCP1,capaCP1);
        c1.addMemoriaUSB(memoriaUSB1);

        String m2 = "Acer";
        float p2 = 8800;
        String nSO2 = "Windows 8";
        int t2 = 64;
        String nHB2 = "Pentium Core i5";
        float capacidade2 = 3370;
        String nCP2 = "Pen-drive";
        int capaCP2 = 32;
        Computador c2 = new Computador(m2,p2,nSO2,t2,nHB2,capacidade2);
        MemoriaUSB memoriaUSB2 = new MemoriaUSB(nCP2,capaCP2);
        c2.addMemoriaUSB(memoriaUSB2);

        String m3 = "Vaio";
        float p3 = 4800;
        String nSO3 = "Windows 10";
        int t3 = 64;
        String nHB3 = "Pentium Core i7";
        float capacidade3 = 4500;
        String nCP3 = "HD";
        int capaCP3 = 1000;
        Computador c3 = new Computador(m3,p3,nSO3,t3,nHB3,capacidade3);
        MemoriaUSB memoriaUSB3 = new MemoriaUSB(nCP3,capaCP3);
        c3.addMemoriaUSB(memoriaUSB3);

        int op;
        int opcao = 0;

        System.out.println("Nome do cliente: ");
        cliente.nome = sc.nextLine();
        System.out.println("CPF do cliente: ");
        cliente.cpf = sc.nextLong();

        while(flag){

            System.out.println("------------------");
            System.out.println("Bem-vindo "+cliente.nome +" menu de informações da promoção!");
            System.out.println("0 - sair");
            System.out.println("1 - Mostrar as configurações dos computadores");
            System.out.println("2 - Comprar computador");
            System.out.println("3 - Computadores comprados");
            System.out.println("4 - Total da compra");

            op = sc.nextInt();

            switch (op){
                case 0:
                    flag = false;
                    break;
                case 1:
                    c1.mostraPCConfigs();
                    c2.mostraPCConfigs();
                    c3.mostraPCConfigs();
                    break;
                case 2:
                    System.out.println("Qual computador deseja comprar?");
                    boolean f = true;
                    while(f) {
                        opcao = sc.nextInt();
                        if(opcao != 1 && opcao !=2 && opcao !=3){
                            System.out.println("Opcao invalida");
                        }
                        else{
                            f = false;
                        }
                    }
                    if(opcao == 1){
                        cliente.computadores[quant] = c1;
                        quant = quant + 1;
                        System.out.println("Computador "+opcao+" comprado");
                    } else if (opcao == 2) {
                        cliente.computadores[quant] = c2;
                        quant = quant + 1;
                        System.out.println("Computador "+opcao+" comprado");
                    } else{
                        cliente.computadores[quant] = c3;
                        quant = quant + 1;
                        System.out.println("Computador "+opcao+" comprado");
                    }
                    break;
                case 3:
                    quantPC = 0;
                    for (int i = 0; i < computador.length; i++) {
                        if(cliente.computadores[i] != null){
                            cliente.computadores[i].mostraPCConfigs();
                            quantPC = quantPC + 1;
                        }
                    }
                    if(quantPC == 0){
                        System.out.println("Nenhum computador comprado");
                    }
                    break;
                case 4:
                    float t = cliente.calculaTotalCompra();
                    System.out.println("Total das compras: "+t);
                    break;
            }
        }
        sc.close();
    }
}