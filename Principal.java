public class Principal {
    public static void main(String[] args) {
        // Criando uma ContaCorrente com saldo inicial de R$ 500 e limite de R$ 200
        ContaCorrente contaCorrente = new ContaCorrente(500.0, 200.0);
        // Criando uma ContaPoupanca com saldo inicial de R$ 300
        ContaPoupanca contaPoupanca = new ContaPoupanca(300.0);

        // Operações com a ContaCorrente
        contaCorrente.consulta(); // Consulta o saldo
        contaCorrente.deposito(150.0); // Deposita R$ 150
        contaCorrente.saque(600.0); // Tenta sacar R$ 600, utilizando o limite

        // Operações com a ContaPoupanca
        contaPoupanca.consulta(); // Consulta o saldo
        contaPoupanca.deposito(100.0); // Deposita R$ 100
        contaPoupanca.saque(350.0); // Tenta sacar R$ 350, o que não é permitido
    }
}
