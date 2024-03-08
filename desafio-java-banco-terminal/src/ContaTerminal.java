import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a agência:");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo:");
        Double saldo = scanner.nextDouble();
        scanner.nextLine();

        scanner.close();

        System.out.println(String.format("""
                Olá %s, obrigado por abrir sua conta em nosso banco. Sua conta foi aberta com sucesso!
                Sua Agência: %s, Conta: %d e seu Saldo: %.2f
                """, nomeCliente, agencia, numero, saldo));

    }
}