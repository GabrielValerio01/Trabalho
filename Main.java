import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        Cliente p1 = new Cliente();
        Cliente p2 = new Cliente();
        while (op != 2) {
            System.out.println("Menu:\n1 - Add Cliente\n2 - Para sair do programa");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    int op2;
                    System.out.println("Digite:\n1 - Add Conta corrente\n2 - Add Conta poupança");
                    op2 = sc.nextInt();
                    if (op2 == 1) {

                        System.out.print("Digite a agencia: ");
                        int agencia = sc.nextInt();
                        System.out.print("Digite o numero da conta: ");
                        int numero = sc.nextInt();
                        System.out.print("Digite o saldo: ");
                        float saldo = sc.nextFloat();
                        System.out.print("Digite seu nome: ");
                        String nome = sc.next();
                        System.out.print("Digite seu CPF: ");
                        int cpf = sc.nextInt();

                        p1.setNome(nome);
                        p1.setCpf(cpf);
                        cc.setAgencia(agencia);
                        cc.setNum(numero);
                        cc.setSaldo(saldo);
                        break;
                    }
                case 2:
                    System.out.println("Programa encerrado!!!");
                    break;

                default:
                    break;
            }
            }
        }

    }
