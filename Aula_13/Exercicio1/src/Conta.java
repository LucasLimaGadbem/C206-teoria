import java.util.HashSet;
import java.util.Set;

public class Conta {

    private float saldo;
    private float limite;
    private Set<Cliente> clientes = new HashSet<>();

    public Conta(float saldo, float limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void sacar(float quantia){
        if(this.saldo > quantia){
            this.saldo -= quantia;
            System.out.println("Quantia de "+quantia+" sacado");
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void deposita(float quantia){
        this.saldo += quantia;
        System.out.println("Quantia de "+quantia+" depositada");
    }

    public void mostraInfo(){
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Limite: "+this.limite);

        for (Cliente cliente : clientes){
            try {
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("CPF: " + cliente.getCpf());
            } catch (NullPointerException e){
                System.out.println("Cliente nulo");
            }
        }
    }
}
