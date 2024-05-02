import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double saldo = 237.48;

        System.out.println("Olá !! Bem Vindo ao Banco DIO.me \n");
        System.out.println("Para iniciar Digite o número da Agência conforme exemplo (000-1): ");
        String agencia = ler.next();

        System.out.println("Agora digite o Numero da conta: ");
        int conta = ler.nextInt();

        System.out.println("Por favor informe seu nome: ");
        String nomeCliente = ler.next();

        System.out.println("Olá " + nomeCliente + " Obrigado por criar uma conta no banco DIO.me !! \n");
        System.out.println("Sua Agência é: " + agencia + " E o numero da sua conta: " + conta);
        System.out.println("Saldo Disponível para saque é de: R$: " + saldo);




    }
}
