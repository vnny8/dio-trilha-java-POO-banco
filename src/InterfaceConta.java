public interface InterfaceConta {

    void depositar(double valor);
    void sacar(double valor);
    void transferir(double valor, InterfaceConta conta);
}
