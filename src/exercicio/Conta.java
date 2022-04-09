package exercicio;

public class Conta {

    private String agencia;
    private int numero;
    private double saldo;
    private double limite;
    private Cliente cliente;

    public Conta(String agencia, int numero, double saldo, double limite, Cliente cliente) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    public Conta() {

    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String sacar(Double valor){
        if (valor > saldo){
            return "Voce so tem R$ " + saldo + " em sua conta.";
        } else if (valor < 0) {
            return "Digite um numero positivo.";
        }
        this.saldo -= valor;
        return "Voce sacou R$ "+valor+" seu saldo eh de R$ "+saldo;
    }

    public String depositar(Double valor){
        if (valor < 0) {
            return "Digite um numero positivo.";
        }
        this.saldo += valor;
        return "Voce depositou R$ "+valor+" seu saldo eh de R$ "+saldo;
    }

    public String toString(){
        return "Agencia:"+agencia+" Conta:"+numero+" Saldo:"+saldo+"\n"+"Cliente:"+cliente.getNome()+" CPF:"+cliente.getCpf()+" Email:"+ cliente.getEmail();
    }

}
