package br.inatel.cdg;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    private Cliente[] cliente = new Cliente[3];

    public Conta(){
        setCliente(new Cliente[3]);
    }
    public Cliente[] getCliente() {
        return cliente;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
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
}
