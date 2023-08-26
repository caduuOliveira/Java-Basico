package ContaBanco;


import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite aqui o numero da sua conta! ");
        int conta = scanner.nextInt();

        System.out.println("Por favor digite a agência! ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome! ");
        String nome = scanner.next();

        System.out.println("Digite seu saldo! ");
        float saldo = scanner.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agencia é %s, conta %d e seu saldo %.2fR$ já está disponivel para saque. ", nome, agencia, conta, saldo);
    }
}
