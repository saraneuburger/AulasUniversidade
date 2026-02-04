public class ContaBancaria {

    private double saldo;
    private Cliente titular;

    public ContaBancaria() {
        saldo = 0;
    }

    public ContaBancaria(Cliente titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean retirar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
