package dependencies;

public class Actions {

    //--------------------<Initial>--------------------

    private double valor;
    private String nome;

    public void recebeValores(int opcao){
        switch(opcao){
            case 1:

                System.out.println("\n\n----------<Movimentação - Transferência>----------\n");
                

                System.out.print("Digite o valor a ser transferido: ");
                this.valor = Double.parseDouble(System.console().readLine());

                System.out.print("Digite nome do contato: ");
                this.nome = System.console().readLine();

                transferenciaBancaria(valor, nome);
            break;

            case 2:

                System.out.println("\n\n----------<Movimentação - Depósito>----------\n");
                

                System.out.print("Digite o valor a ser depositado: ");
                this.valor = Double.parseDouble(System.console().readLine());
        
                depositoBancario(valor);

            break;

            case 3:

                System.out.println("\n\n----------<Loja - Compra>----------\n");
                System.out.println("Escolha um item abaixo para comprar: \n");

                System.out.println("1. Playstation 5");
                System.out.println("2. Caneca Toast");
                System.out.println("3. Camiseta Estampa Personalizada");
                System.out.println("4. Jogo AAA PS5/PC");

                System.out.print("\nSua opção: ");
                int item = Integer.parseInt(System.console().readLine());

                compraItem(item);

            break;

            case 4:

                System.out.println("\n\n----------<Loja - Venda>----------\n");

                System.out.print("Digite o valor do item: ");
                this.valor = Double.parseDouble(System.console().readLine());

                System.out.print("Digite nome do item a ser vendido: ");
                this.nome = System.console().readLine();

                vendaItem(valor, nome);

            break;

        }

    }

    //--------------------<Transfer>--------------------
    
    public void transferenciaBancaria(double valor, String nome){
        if((Balance.getSaldo() - valor) <= 0)
        {
            System.out.println("Saldo Insuficiente");
        }
        else
        {
            Balance.setSaldo(Balance.getSaldo() - valor);

            System.out.printf("\nTransferência efetuada no valor de R$ %.2f para %s.", valor, nome);
            System.out.printf("\nSeu novo saldo é de R$ %.2f.", Balance.getSaldo());
        }
    
    }

    //--------------------<Depot>--------------------

    public void depositoBancario(double valor){

        Balance.setSaldo(Balance.getSaldo() + valor);

        System.out.printf("\nDepósito efetuado no valor de R$ %.2f.", valor);
        System.out.printf("\nSeu novo saldo é de R$ %.2f.", Balance.getSaldo());

    }

    //--------------------<Buy>--------------------

    public void verificaSaldo(double valor, String nome){

        if((Balance.getSaldo() - valor) <= 0)
            {
                System.out.println("\nSaldo Insuficiente.\n");
            }
            else
            {
                Balance.setSaldo(Balance.getSaldo() - valor);
                System.out.printf("\n%s comprado com sucesso, seu novo saldo é de R$ %.2f", nome , valor);
            }
    }

    public void compraItem(int item){

        double valor;
        String nome;

        switch(item){
            case 1:
                valor = 4500;
                nome = "Playstation 5";
                verificaSaldo(valor, nome);

            break;

            case 2:
                valor = 45;
                nome = "Caneca Toast";
                verificaSaldo(valor, nome);
            break;

            case 3:
                valor = 60;
                nome = "Camiseta Estampa Personalizada";
                verificaSaldo(valor, nome);
            break;

            case 4:
                valor = 249.99;
                nome = "Jogo AAA PS5/PC";
                verificaSaldo(valor, nome);
            break;
        }
    }

    //--------------------<Sell>--------------------

    public void vendaItem(double valor, String nome){
        Balance.setSaldo(Balance.getSaldo() + valor);

        System.out.printf("\n%s vendido na loja por R$ %.2f.", nome, valor);

        System.out.printf("\nSeu novo saldo é de R$ %.2f.", Balance.getSaldo());
    }

    //--------------------<Functions>--------------------

    int opcao;

    public void setOpcao(){

        do
        {

            System.out.println("\n\nDeseja realizar outra operação?\n\n1. Sim\n2. Não");
            System.out.print("\nSua opção: ");
            opcao = Integer.parseInt(System.console().readLine());
        
            if ((opcao != 1) && (opcao != 2)){
                System.out.println("Opção Inválida");
            }

        }while((opcao != 1) && (opcao != 2));

    }

    public int getOpcao(){
        return opcao;
    }

}