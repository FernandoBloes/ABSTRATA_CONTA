public abstract class ContaBancaria {
    protected double saldo;

    // Construtor que inicializa o saldo incial da conta
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Métodos abstratos implementados pelas subclasses
    public abstract void saque(double valor);

    public abstract void deposito(double valor);

    public abstract void consulta();
}
