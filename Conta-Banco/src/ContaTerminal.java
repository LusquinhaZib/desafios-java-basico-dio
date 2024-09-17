import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da sua conta: ");
        int numero = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o número da sua agência (com hífen): ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o saldo da sua conta (utilize uma vírgula pra separar os centavos): ");
        double saldo = scanner.nextDouble();

        System.out.print("Olá, " + nome + ". " + "Obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + ", conta número " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque!");
    }
}