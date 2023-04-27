package Question_11;

public class Conta {
    double saldo;
    int id;

    void transferir(Conta contaFrom, Conta contaTo, double transferencia){
        if (transferencia > contaFrom.saldo){
            System.out.println("Saldo insuficiente!");
        }else{
            contaFrom.saldo -= transferencia;
            contaTo.saldo += transferencia;
            System.out.printf("Novo saldo: " + "%.2f", contaTo.saldo);
        }

    }

    public static void main(String[] args){
        Conta conta1 = new Conta();
        conta1.id = 21;
        conta1.saldo = 2132.3;

        Conta conta2 = new Conta();
        conta2.id = 22;
        conta2.saldo = 21132.3;

        conta1.transferir(conta1, conta2, 255);
    }
}
