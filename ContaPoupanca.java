public class ContaPoupanca extends ContaBancaria {
    private final double TAXA_SAQUE = 3.0; // Taxa para saques
    private final double TAXA_DEPOSITO = 1.0; // Taxa para depósitos
    private final double TAXA_CONSULTA = 0.50; // Taxa para consulta

    // Construtor que inicializa o saldo
    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    // Saque não deve ser maior que o saldo disponível, (saldo insuficiente)
    @Override
    public void saque(double valor) {
        double valorComTaxa = valor + TAXA_SAQUE;
        if (saldo >= valorComTaxa) {
            saldo -= valorComTaxa;
            System.out.println("Saque realizado: " + valor + " (com taxa de saque)");
        } else {
            System.out.println("Saque não permitido. Saldo insuficiente.");
        }
    }

    // Depósito com taxa
    @Override
    public void deposito(double valor) {
        saldo += (valor - TAXA_DEPOSITO); // Desconta a taxa do valor depositado
        System.out.println("Depósito realizado: " + valor + " (com taxa de depósito)");
    }

    // Verifica o saldo e aplicando a taxa pela operação
    @Override
    public void consulta() {
        saldo -= TAXA_CONSULTA; // Desconta a taxa de consulta
        System.out.println("Saldo atual: R$" + saldo + " (com taxa de consulta)");
    }
}
