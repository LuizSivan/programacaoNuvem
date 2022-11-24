import dependencies.*;

public class AppCBank
{

    public static void main(String[] args) throws Exception
    {

        Actions actions = new Actions();

        System.out.println("\n----------<Início do Programa>----------\n");
        System.out.println("\nOlá, este é o App CBank.");
        System.out.printf("\nSeu saldo atual é de R$ %.2f.", Balance.getSaldo());
        
        int opcao;
        
        do
        {   

            System.out.println("\n\n----------<Menu Inicial>----------\n");
            System.out.println("Escolha uma opção do menu abaixo para executar uma ação: \n");

            System.out.println("1. Transferência Bancária");
            System.out.println("2. Depósito Bancário");
            System.out.println("3. Comprar um item na Loja CBank");
            System.out.println("4. Vender um item na Loja CBank");

            System.out.print("\nSua opção: ");
            opcao = Integer.parseInt(System.console().readLine());

            
            switch (opcao) {
                case 1:
                case 2:
                case 3:
                case 4:
                    actions.recebeValores(opcao);
                break;
            
                default: 
                    System.out.println("Opção Inválida");
                break;
            }
            actions.setOpcao();
            opcao = actions.getOpcao();

        } while((opcao != 2));

        Balance.imprimeExtrato();

        System.out.println("\nO CBank agradece.");
        System.out.println("\n----------<Fim do Programa>----------\n");

    }
    
}