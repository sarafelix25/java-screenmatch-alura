import java.util.*;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Sara Felix";
        String tipoConta = "Corrente";
        double saldo = 2428.00;
        int opcao = 0;

        System.out.println("********************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n********************************");

        Scanner leitura = new Scanner(System.in);
        String menu =
                "** Digite sua opção **\n"+
                "1 - Consultar saldo\n"+
                "2 - Transferir valor\n"+
                "3 - Receber valor\n"+
                "4 - Sair\n";

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é de R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo de R$ " + saldo);
                } 
            } else if (opcao == 3) {
                System.out.println("Valor recebido R$ ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo de R$ " + saldo);
            } else if (opcao == 4) {
                System.out.println("Encerrando o programa.");
                break;
            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}
