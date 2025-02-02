package conta_banco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração de Variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;


        // Solicitação de dados ao usuário
        System.out.print("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        System.out.print("Por favor, digite o numero da Agencia: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o Saldo: ");
        saldo = scanner.nextDouble();

        // Exibição da mensagem final
        System.out.println("\n ========================================");
        System.out.println("Olá, " + nomeCliente + ". Seja bem-vindo(a) ao Banco Java. Estamos muito felizes por ter você conosco.");
        System.out.println("Agencia: " + agencia);
        System.out.println("Conta: " + numero);
        System.out.println("Saldo: " + saldo);
        System.out.println("Seu saldo está disponível para saque, " + nomeCliente);
        System.out.println(" ======================================== \n");
        System.out.println("Conte conosco para tornar sua experiência excepcional!\n");

        scanner.close(); // Fechar o scanner
        
    }
}
