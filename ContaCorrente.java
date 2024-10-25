public class ContaCorrente extends ContaBancaria {
    public double limite; // Limite adicional após saldo zerado
    public final double TAXA_SAQUE = 5.0; // Taxa fixa para saques
    public final double TAXA_DEPOSITO = 2.0; // Taxa fixa para depósitos
    public final double TAXA_CONSULTA = 1.0; // Taxa para consultar saldo

    // Construtor que define o saldo inicial e o limite da conta
    public ContaCorrente(double saldoInicial, double limite) {
        super(saldoInicial);
        this.limite = limite;
    }

    // Saque permite ultrapassar o saldo, mas não o limite
    @Override
    public void saque(double valor) {
        double valorComTaxa = valor + TAXA_SAQUE;
        if (saldo + limite >= valorComTaxa) {
            saldo -= valorComTaxa;
            if (saldo < 0) {
                limite += saldo; // Reduz o limite
                saldo = 0; // Saldo não fica negativo
            }
            System.out.println("Saque realizado: " + valor + " (com taxa de saque)");
        } else {
            System.out.println("Saque não permitido. Limite insuficiente.");
        }
    }

    // Depósito com taxa
    @Override
    public void deposito(double valor) {
        saldo += (valor - TAXA_DEPOSITO); // Desconta a taxa do valor depositado
        System.out.println("Depósito realizado: " + valor + " (com taxa de depósito)");
    }

    // Consulta o saldo e aplica uma taxa pela operação
    @Override
    public void consulta() {
        saldo -= TAXA_CONSULTA; // Desconta a taxa de consulta
        System.out.println("Saldo atual: R$" + saldo + " (com taxa de consulta)");
    }
}
