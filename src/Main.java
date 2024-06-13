public class Main {

    public static void main(String[] args) {
        Cliente gaya = new Cliente();
        gaya.setNome("Gaya");

        Conta cc = new ContaCorrente(gaya);
        Conta poupanca = new ContaPoupanca(gaya);

        cc.depositar(100);
        cc.imprimirExtrato();
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }


}
