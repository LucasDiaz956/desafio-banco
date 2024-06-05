public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(100);
        
        Conta poupança = new ContaPoupança();
        cc.transferir(100, poupança);


        cc.imprimirExtrato();
        poupança.imprimirExtrato();
    }

}
