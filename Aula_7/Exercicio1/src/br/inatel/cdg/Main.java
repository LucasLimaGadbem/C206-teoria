package br.inatel.cdg;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();

        cliente1.setNome("Lucas");
        cliente1.setCpf(1190001010);

        Cliente cliente2 = new Cliente();

        cliente2.setNome("Skelen");
        cliente2.setCpf(2020202020);

        Cliente[] clientes = new Cliente[3];
        clientes[0] = cliente1;
        clientes[1] = cliente2;

        Conta conta = new Conta();

        conta.setCliente(clientes);
        conta.setNumero(20);
        conta.setLimite(2000);

        System.out.println(conta.getSaldo());

        conta.deposita(50);

        System.out.println("Saldo: "+conta.getSaldo());

        conta.sacar(30);

        System.out.println("Saldo: "+conta.getSaldo());

        conta.sacar(100);

        System.out.println("Clientes: ");
        System.out.println(conta.getCliente()[0].getNome());
        System.out.println(conta.getCliente()[1].getNome());
    }
}