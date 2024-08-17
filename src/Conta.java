public abstract class Conta implements InterfaceConta{

    private static final int AGENCIA_PADRAO = 1001;
    private static int SEQUENCIAL = 1;

    protected double saldo;
    protected int agencia;
    protected int numero;
    protected Cliente titular;

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, InterfaceConta conta) {
        conta.depositar(valor);
        this.sacar(valor);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", agencia=" + agencia +
                ", numero=" + numero +
                ", titular=" + titular +
                '}';
    }

    public Conta(Cliente titular) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.titular = titular;
        this.saldo = 0;
    }



}
