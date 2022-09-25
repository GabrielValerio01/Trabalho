
public class Conta {

    private int agencia;
    private int num;
    private double saldo;

    public Conta() {
        this.num = 0;
        this.saldo = 0;
        this.agencia = 0;
    }

    public Conta(int agencia, int num, double saldo) {
        this.agencia = agencia;
        this.num = num;
        this.saldo = saldo;
    }

    public Conta(double saldo){
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    @Override
    public String toString() {
        return "Conta{" + "agencia=" + agencia + ", num=" + num + ", saldo=" + saldo + '}';
    }

    public void imprimir() {
        System.out.println("\nAgencia: " + agencia + "\nNúmero: " + num + "\nSaldo: " + saldo);

    }
}
