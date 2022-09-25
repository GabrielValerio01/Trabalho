public class ContaPoupanca extends Conta {
        public ContaPoupanca() {
        }

        public ContaPoupanca(int agencia, int num, float saldo) {
            super(agencia, num, saldo);

        }

        @Override
        public String toString() {
            return """
               ----------------
               |Conta_Poupança|
               ----------------
               Usuário:\n """ + "\nNumero: " + getNum() + "\nSaldo: " + getSaldo() + "\nAgencia: " + getAgencia() + "\n";
        }

}
