public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Sara", "000.000.000-00");
        ContaBancaria conta = new ContaBancaria(cliente);

        conta.depositar(1000);
        conta.retirar(200);

        System.out.println(conta.getSaldo());
    }
}
