
public class Banco {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("123", "Cliente1");
        ContaCorrente contaCorrente = new ContaCorrente(cliente);

        contaCorrente.depositar(100);
        System.out.println(contaCorrente.toString());
        contaCorrente.sacar(10);
        System.out.println(contaCorrente.toString());

        Cliente cliente1 = new Cliente("456", "Cliente2");
        ContaPoupanca contaPoupancaCliente1 = new ContaPoupanca(cliente1);
        contaCorrente.transferir(25, contaPoupancaCliente1);
        System.out.println(contaPoupancaCliente1.toString());
        System.out.println(contaCorrente.toString());
    }
}