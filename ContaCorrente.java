public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int num, float saldo) {
        super(agencia, num, saldo);
    }

    public ContaCorrente() {

    }

    @Override
    public String toString() {
        return """
                
               ----------------
               |Conta_Corrente|
               ----------------
               Usuário:\n """ + "\nNumero: " + getNum() + "\nSaldo: " + getSaldo() + "\nAgencia: " + getAgencia() + "\nLimite: " + "\n";
    }

}