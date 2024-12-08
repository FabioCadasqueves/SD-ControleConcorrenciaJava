public class Familia {
    public static void main(String args[]) {
        // Cria conta conjunta da família com saldo inicial
        final Conta conta = new Conta(100.0); // Saldo inicial de R$ 1000,00

        // Cria familiares e lhes informa a conta conjunta
        Cliente pai = new Cliente("Pai ", conta);
        Cliente mae = new Cliente("Mãe ", conta);
        Cliente filho = new Cliente("Filho ", conta);

        // Inicia as threads
        pai.start();
        mae.start();
        filho.start();
    }
}
