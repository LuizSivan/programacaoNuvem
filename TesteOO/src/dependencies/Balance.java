package dependencies;

public class Balance {
    
    private static double saldo = 0;

    public static void setSaldo(double valor){
        Balance.saldo = valor;
    }
    
    public static double getSaldo(){
        return saldo;
    }

    public static void imprimeExtrato(){
        System.out.println("\nDeseja imprimir o extrato bancário?\n\n1. Sim\nDigite qualquer outro número para Não\n");
        System.out.print("\nSua opção: ");
        int opcao = Integer.parseInt(System.console().readLine());

        if(opcao == 1){
            System.out.printf("\nSaldo atual: R$ %.2f\n", Balance.getSaldo());
        }

    }

}