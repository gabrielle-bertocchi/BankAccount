import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Jonathan Sales";
        String tipoAccount = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("*******************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo da Conta: " + tipoAccount);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*******************************\n");

        String menu = """
                ** Digite sua opçāo**
                1 - Consultar Saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);


        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("""
                            \n**********************************
                            Seu saldo atual é: """ + saldo + """
                            \n**********************************
                            """);
            } else if (opcao == 2) {
                System.out.println("Qual valor você deseja transferir?");
                double valor = leitura.nextInt();
                if (valor > saldo){
                    System.out.println("Nāo há saldo para realizar transferêcia");
                } else {
                    saldo -= valor;
                    System.out.println("""
                            Tranferência realizada com sucesso!
                            \n**********************************
                            Seu saldo atual é: """ + saldo + """
                            \n**********************************
                            """);
                }
                }
            else if (opcao == 3) {
                System.out.println("Digite o valor que deseja depositar: ");
                double valor = leitura.nextInt();
                saldo += valor;
                System.out.println("""
                            Depósito efetuado com sucesso!
                            \n**********************************
                            Seu saldo atual é: """ + saldo + """
                            \n**********************************
                            """);
            }else if(opcao == 4){
                System.out.println("Operaçāo finalizada! Obrigado por escolher nosso banco!");
                break;
            }

        }


    }
}